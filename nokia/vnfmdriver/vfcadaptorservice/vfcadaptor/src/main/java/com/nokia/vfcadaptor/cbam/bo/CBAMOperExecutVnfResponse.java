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
package com.nokia.vfcadaptor.cbam.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nokia.vfcadaptor.cbam.bo.entity.OperationExecution;
import com.nokia.vfcadaptor.cbam.bo.entity.ProblemDetails;

public class CBAMOperExecutVnfResponse {
	
	@JsonProperty("operationExecution")
	private List<OperationExecution> operationExecution;
	
	@JsonProperty("problemDetails")
	private ProblemDetails problemDetails;

	
	public List<OperationExecution> getOperationExecution() {
		return operationExecution;
	}

	public void setOperationExecution(List<OperationExecution> operationExecution) {
		this.operationExecution = operationExecution;
	}

	public ProblemDetails getProblemDetails() {
		return problemDetails;
	}

	public void setProblemDetails(ProblemDetails problemDetails) {
		this.problemDetails = problemDetails;
	}
	
	
	

}
