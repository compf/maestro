package com.netflix.maestro.engine.handlers;

import com.netflix.maestro.common.Workflow;
import com.netflix.maestro.common.RunProperties;
import com.netflix.maestro.common.ForeachArtifact;
import java.util.List;

public class ForeachBatchContext {
    private final Workflow workflow;
    private final Long internalId;
    private final long workflowVersionId;
    private final RunProperties runProperties;
    private final String foreachStepId;
    private final ForeachArtifact artifact;
    private final List<RunRequest> requests;
    private final List<Long> instanceIds;

    public ForeachBatchContext(
        Workflow workflow,
        Long internalId,
        long workflowVersionId,
        RunProperties runProperties,
        String foreachStepId,
        ForeachArtifact artifact,
        List<RunRequest> requests,
        List<Long> instanceIds) {
        this.workflow = workflow;
        this.internalId = internalId;
        this.workflowVersionId = workflowVersionId;
        this.runProperties = runProperties;
        this.foreachStepId = foreachStepId;
        this.artifact = artifact;
        this.requests = requests;
        this.instanceIds = instanceIds;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public Long getInternalId() {
        return internalId;
    }

    public long getWorkflowVersionId() {
        return workflowVersionId;
    }

    public RunProperties getRunProperties() {
        return runProperties;
    }

    public String getForeachStepId() {
        return foreachStepId;
    }

    public ForeachArtifact getArtifact() {
        return artifact;
    }

    public List<RunRequest> getRequests() {
        return requests;
    }

    public List<Long> getInstanceIds() {
        return instanceIds;
    }
}