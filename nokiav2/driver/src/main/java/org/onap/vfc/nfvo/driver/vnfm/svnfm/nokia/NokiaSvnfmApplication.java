/*
 * Copyright 2016-2017, Nokia Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.vfc.nfvo.driver.vnfm.svnfm.nokia;

import org.onap.vfc.nfvo.driver.vnfm.svnfm.nokia.onap.core.SelfRegistrationManager;
import org.onap.vfc.nfvo.driver.vnfm.svnfm.nokia.vnfm.JobManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Represents the spring boot application
 */
@SpringBootApplication
public class NokiaSvnfmApplication {
    private static Logger logger = getLogger(NokiaSvnfmApplication.class);

    /**
     * Entry point for the Spring boot application
     *
     * @param args arguments for the application (not used)
     */
    public static void main(String[] args) {
        SpringApplication.run(NokiaSvnfmApplication.class, args);
    }

    /**
     * Responsible for starting the self registration process after the servlet has been started
     * and is ready to answer REST request
     * - has been disabled in the test because the application that provides the ONAP simulator
     * has already not yet been started (can not answer REST requests)
     */
    @Component
    @Profile("!test")
    public static class SelfRegistrationTrigger implements ApplicationListener<ApplicationReadyEvent> {
        @Autowired
        private SelfRegistrationManager selfRegistrationManager;

        @Override
        public void onApplicationEvent(ApplicationReadyEvent contextRefreshedEvent) {
            logger.info("Self registration started");
            try {
                selfRegistrationManager.register();
                logger.info("Self registration finished");
            } catch (RuntimeException e) {
                logger.error("Self registration failed", e);
                throw e;
            }
        }
    }

    /**
     * Responsible for starting the un-registration process after the service has been ramped down
     * - has been disabled in test because the same application that provides the ONAP simulator
     * has already been ramped down (can not answer REST requests)
     */
    @Component
    @Profile("!test")
    public static class SelfDeRegistrationTrigger implements ApplicationListener<ContextClosedEvent> {
        @Autowired
        private SelfRegistrationManager selfRegistrationManager;
        @Autowired
        private JobManager jobManager;

        @Override
        public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
            logger.info("Self de-registration started");
            try {
                jobManager.prepareForShutdown();
                selfRegistrationManager.deRegister();
            } catch (RuntimeException e) {
                logger.error("Self de-registration failed", e);
                throw e;
            }
            logger.info("Self de-registration finished");
        }
    }
}
