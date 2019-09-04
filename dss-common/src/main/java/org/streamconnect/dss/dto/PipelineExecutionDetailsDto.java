/*
* Copyright 2019 Infosys Ltd.
*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.streamconnect.dss.dto;

import java.io.Serializable;

/**
 * The type Pipeline execution details dto.
 */
public class PipelineExecutionDetailsDto implements Serializable {

    /** The str exec pipeline status. */
    private String strExecPipelineStatus;

    /** The str exec pipeline log. */
    private String strExecPipelineLog;

    /**
     * Gets str exec pipeline status.
     *
     * @return the str exec pipeline status
     */
    public String getStrExecPipelineStatus() {
        return strExecPipelineStatus;
    }

    /**
     * Sets str exec pipeline status.
     *
     * @param strExecPipelineStatus the str exec pipeline status
     */
    public void setStrExecPipelineStatus(final String strExecPipelineStatus) {
        this.strExecPipelineStatus = strExecPipelineStatus;
    }

    /**
     * Gets str exec pipeline log.
     *
     * @return the str exec pipeline log
     */
    public String getStrExecPipelineLog() {
        return strExecPipelineLog;
    }

    /**
     * Sets str exec pipeline log.
     *
     * @param strExecPipelineLog the str exec pipeline log
     */
    public void setStrExecPipelineLog(final String strExecPipelineLog) {
        this.strExecPipelineLog = strExecPipelineLog;
    }
}
