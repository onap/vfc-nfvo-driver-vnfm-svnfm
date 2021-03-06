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

package org.onap.vfc.nfvo.vnfm.svnfm.vnfmadapter.common.servicetoken;

import java.util.HashMap;
import java.util.Map;

import org.onap.vfc.nfvo.vnfm.svnfm.vnfmadapter.common.restclient.HttpRest;
import org.onap.vfc.nfvo.vnfm.svnfm.vnfmadapter.common.restclient.Restful;

/**
 * HTTP Restful helper.
 * .</br>
 *
 * @author
 * @version     VFC 1.0  Sep 10, 2016
 */
public class HttpRestfulHelp {

    public static final String PROTO_HTTPS = "https";

    public static final String PROTO_HTTP = "http";

    private static final Map<String, Restful> INSTANCES = new HashMap<>(2);

    private HttpRestfulHelp() {
        // constructor
    }

    /**
     * Factory method to create Restful instances.
     * <br>
     *
     * @param ssloptionfile
     * @param restoptionfile
     * @return
     * @since  VFC 1.0
     */
    public static synchronized Restful getRestInstance(String ssloptionfile, String restoptionfile) {
        Restful rest = INSTANCES.get(PROTO_HTTP);
        if(rest != null) {
            return rest;
        }
        rest = createHttpsRest(ssloptionfile, restoptionfile);
        INSTANCES.put(PROTO_HTTP, rest);
        return rest;
    }

    private static Restful createHttpsRest(String ssloptionfile, String restoptionfile) { //NOSONAR
        return new HttpRest();
    }

}
