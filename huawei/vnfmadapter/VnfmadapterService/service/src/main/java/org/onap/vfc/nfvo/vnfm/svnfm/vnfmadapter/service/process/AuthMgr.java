/*
 * Copyright 2016-2017 Huawei Technologies Co., Ltd.
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

package org.onap.vfc.nfvo.vnfm.svnfm.vnfmadapter.service.process;

import org.onap.vfc.nfvo.vnfm.svnfm.vnfmadapter.service.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 * Provide function for authInfo.
 * <br/>
 *
 * @author
 * @version VFC 1.0 Aug 24, 2016
 */
public class AuthMgr {

    private static final Logger LOG = LoggerFactory.getLogger(AuthMgr.class);

    /**
     * Provide function for add authInfo.
     * <br/>
     *
     * @param params
     * @return
     * @since VFC 1.0
     */
    public JSONObject authToken(JSONObject params) {
        JSONObject restJson = new JSONObject();
        restJson.put(Constant.RETCODE, Constant.REST_FAIL);
        try {
            String userName = params.getString(Constant.USERNAME);
            restJson = getStatusResult(userName);
        } catch(JSONException e) {
            LOG.error("function=login, msg=Params error occurs, e={}.", e);
            restJson.put("data", "JSONException");
            return restJson;
        }
        return restJson;
    }

    private JSONObject getStatusResult(String userName) {
        JSONObject restJson = new JSONObject();
        JSONObject authResult = new JSONObject();
        JSONObject addInfo = new JSONObject();
        authResult.put("accessSession", "1234");
        authResult.put("roaRand", "RoaRand");
        authResult.put("expires", 1800);
        addInfo.put("expires", 10);
        addInfo.put("passwdStatus", "expiring");
        authResult.put("additionalInfo", addInfo);
        restJson.put(Constant.RETCODE, Constant.REST_SUCCESS);
        restJson.put("data", authResult);
        return restJson;
    }
}
