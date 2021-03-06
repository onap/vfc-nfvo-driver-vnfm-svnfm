/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
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

package org.openo.nfvo.vnfmadapter.test;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.onap.vfc.nfvo.vnfm.svnfm.vnfmadapter.common.restclient.ServiceException;
import org.openo.nfvo.vnfmadapter.mocoserver.VnfmAdapterSuccessServer;
import org.openo.nfvo.vnfmadapter.util.FailureChecker;
import org.openo.nfvo.vnfmadapter.util.GetSuccessChecker;
import org.openo.nfvo.vnfmadapter.util.MyTestManager;
import org.openo.nfvo.vnfmadapter.util.SuccessChecker;

/**
 * <br>
 * <p>
 * </p>
 * 
 * @author
 * @version VFC 1.0 Sep 24, 2016
 */
public class ITVnfAdapterResourceRoaFail extends MyTestManager {

    private static final String GET_PATH = "src/integration-test/resources/vnfmadapter/testcase/vnfadapterresourceroa/querygetallcloudinfofail.json";

    private VnfmAdapterSuccessServer vnfmAdapterServer = new VnfmAdapterSuccessServer(31943);


    @Before
    public void setup() throws ServiceException, InterruptedException {
    	vnfmAdapterServer.start();
//    	Thread.sleep(1000*30);
    }

    @After
    public void tearDown() throws ServiceException {
    	vnfmAdapterServer.stop();
    }

    @Test
    public void testOperateSuccess() throws ServiceException {
        execTestCase(new File(GET_PATH),new FailureChecker());
    }
}
