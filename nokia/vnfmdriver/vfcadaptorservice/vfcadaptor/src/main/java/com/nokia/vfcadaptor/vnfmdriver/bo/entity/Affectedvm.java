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

package com.nokia.vfcadaptor.vnfmdriver.bo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Affectedvm {
	@JsonProperty("vimid")
	private String vimid;
	
	@JsonProperty("vduid")
	private String vduid;
	
	@JsonProperty("vmname")
	private String vmname;

	public String getVimid() {
		return vimid;
	}

	public void setVimid(String vimid) {
		this.vimid = vimid;
	}

	public String getVduid() {
		return vduid;
	}

	public void setVduid(String vduid) {
		this.vduid = vduid;
	}

	public String getVmname() {
		return vmname;
	}

	public void setVmname(String vmname) {
		this.vmname = vmname;
	}

	
	
	
}
