/*
 * Copyright 2024 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netflix.maestro.engine.dao;

public class WorkflowExecutionDetails {

  private java.lang.String workflowId;

  private long version;

  private long instanceId;

  private long runId;

  private java.lang.String stepId;

  private long stepAttemptId;

  public java.lang.String getWorkflowId() {
    return workflowId;
  }

  public long getVersion() {
    return version;
  }

  public long getInstanceId() {
    return instanceId;
  }

  public long getRunId() {
    return runId;
  }

  public java.lang.String getStepId() {
    return stepId;
  }

  public long getStepAttemptId() {
    return stepAttemptId;
  }

  public void setWorkflowId(java.lang.String workflowId) {
    this.workflowId = workflowId;
  }

  public void setVersion(long version) {
    this.version = version;
  }

  public void setInstanceId(long instanceId) {
    this.instanceId = instanceId;
  }

  public void setRunId(long runId) {
    this.runId = runId;
  }

  public void setStepId(java.lang.String stepId) {
    this.stepId = stepId;
  }

  public void setStepAttemptId(long stepAttemptId) {
    this.stepAttemptId = stepAttemptId;
  }

  public WorkflowExecutionDetails(
      java.lang.String workflowId,
      long version,
      long instanceId,
      long runId,
      java.lang.String stepId,
      long stepAttemptId) {
    this.workflowId = workflowId;
    this.version = version;
    this.instanceId = instanceId;
    this.runId = runId;
    this.stepId = stepId;
    this.stepAttemptId = stepAttemptId;
  }
}
