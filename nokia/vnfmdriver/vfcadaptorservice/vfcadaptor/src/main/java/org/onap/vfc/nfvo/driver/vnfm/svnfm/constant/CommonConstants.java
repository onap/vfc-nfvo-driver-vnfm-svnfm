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

package org.onap.vfc.nfvo.driver.vnfm.svnfm.constant;

public class CommonConstants {
	public static final String SCHEMA_HTTP = "http";
	
	public static final String HTTP_ERROR_DESC_500 = "Internal Server Error";
	
	
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String ACCEPT = "Accept";
	
	public static final String AUTH = "auth";
	public static final String AUTHORIZATION = "Authorization";
	public static final String UTF_8 = "utf-8";
	
	//AAI path get vnfm
	// /external-system/esr-vnfm-list/esr-vnfm/{vnfm-id}/esr-system-info-list
	public static final String RetrieveVnfmListPath = "/aai/v11/external-system/esr-vnfm-list/esr-vnfm/%s/esr-system-info-list";
	
	//Nslcm path
	public static final String NslcmGrantPath = "/api/nslcm/v1/ns/grantvnf";
	public static final String NslcmNotifyPath = "/api/nslcm/v1/ns/%s/vnfs/%s/Notify";
	
	//Catalog path
	public static final String RetrieveVnfPackagePath = "/api/catalog/v1/vnfpackages/%s";
	
	//CBAM -- Nokia VNFM path
	public static final String CBAM_TOKEN_KEY = "access_token";
	public static final String CbamRetrieveTokenPath="/auth/realms/cbam/protocol/openid-connect/token";
	public static final String CbamRetrieveTokenPostStr="grant_type=password&client_id=%s&client_secret=%s&username=%s&password=%s";
	public static final String CbamCreateVnfPath="/vnfm/lcm/v3/vnfs";
	public static final String CbamModifyVnfPath="/vnfm/lcm/v3/vnfs/%s";
	public static final String CbamInstantiateVnfPath="/vnfm/lcm/v3/vnfs/%s/instantiate";
	public static final String CbamQueryVnfPath="/vnfm/lcm/v3/vnfs/%s";
	public static final String CbamDeleteVnfPath="/vnfm/lcm/v3/vnfs/%s";
	public static final String CbamTerminateVnfPath="/vnfm/lcm/v3/vnfs/%s/terminate";
	public static final String CbamGetOperStatusPath="/vnfm/lcm/v3/operation_executions/%s";
	public static final String CbamScaleVnfPath = "/vnfm/lcm/v3/vnfs/%s/scale";
	public static final String CbamHealVnfPath="/vnfm/lcm/v3/vnfs/%s/heal";
	public static final String CbamQueryVnfcResourcePath="/vnfm/lcm/v3/vnfs/%s/vnfc_resource_info";
	public static final String CbamCreateSubscriptionPath="/vnfm/lcn/v3/subscriptions";
	public static final String CbamGetSubscriptionPath="/vnfm/lcn/v3/subscriptions/%s";
	public static final String CbamGetNotificationPath="/vnfm/lcn/v3/notifications";
	
	public static final String CbamUploadVnfPackagePath="/api/catalog/adapter/vnfpackages";
	
	
	public static final String NSLCM_OPERATION_INSTANTIATE = "Instantiate";
	public static final String NSLCM_OPERATION_TERMINATE = "Terminal";
	public static final String NSLCM_OPERATION_SCALE_OUT = "Scaleout";
	public static final String NSLCM_OPERATION_SCALE_IN = "Scalein";
	public static final String NSLCM_OPERATION_SCALE_UP = "Scaleup";
	public static final String NSLCM_OPERATION_SCALE_DOWN = "Scaledown";
	public static final String NSLCM_OPERATION_HEAL = "Heal";
	
	public static final String CBAM_OPERATION_STATUS_START = "started";
	public static final String CBAM_OPERATION_STATUS_PROCESSING = "processing";
    public static final String CBAM_OPERATION_STATUS_FINISH = "finished";
	public static final String CBAM_OPERATION_STATUS_ERROR = "error";
	
	//MSB
	public static final String MSB_REGISTER_SERVICE_PATH = "/api/microservices/v1/services";
	public static final String MSB_UNREGISTER_SERVICE_PATH = "/api/microservices/v1/services/%s/version/%s/nodes/%s/%s";
	public static final String MSB_QUERY_SERVICE_PATH = "/api/microservices/v1/services/%s/version/%s";
}
