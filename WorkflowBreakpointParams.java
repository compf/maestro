public class WorkflowBreakpointParams {
    private final String workflowId;
    private final long version;
    private final long instanceId;
    private final long runId;
    private final String stepId;
    private final long attemptId;

    public WorkflowBreakpointParams(String workflowId, long version, long instanceId, long runId, String stepId, long attemptId) {
        this.workflowId = workflowId;
        this.version = version;
        this.instanceId = instanceId;
        this.runId = runId;
        this.stepId = stepId;
        this.attemptId = attemptId;
    }

    public String getWorkflowId() {
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

    public String getStepId() {
        return stepId;
    }

    public long getAttemptId() {
        return attemptId;
    }
}