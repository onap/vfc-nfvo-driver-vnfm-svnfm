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
package com.nokia.vfcadaptor.nslcm.bo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nokia.vfcadaptor.constant.CommonEnum;

public class ResourceDefinition {
	
	@JsonProperty("type")
	private CommonEnum.type type;
	
	@JsonProperty("resourceDefinitionId")
	private String resourceDefinitionId;
	
	@JsonProperty("vdu")
	private String vdu;

	public CommonEnum.type getType() {
		return type;
	}

	public void setType(CommonEnum.type type) {
		this.type = type;
	}

	public String getResourceDefinitionId() {
		return resourceDefinitionId;
	}

	public void setResourceDefinitionId(String resourceDefinitionId) {
		this.resourceDefinitionId = resourceDefinitionId;
	}

	public String getVdu() {
		return vdu;
	}

	public void setVdu(String vdu) {
		this.vdu = vdu;
	}
	
	
	

}
