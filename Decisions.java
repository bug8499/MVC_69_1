public class Decisions {
    private String requester_id;
    private String target_id;
    private Status status;

    public Decisions(String requester_id, String target_id, Status status) {
        this.requester_id = requester_id;
        this.target_id = target_id;
        this.status = status;
    }

    public String getRequester_id() {
        return requester_id;
    }

    public void setRequester_id(String requester_id) {
        this.requester_id = requester_id;
    }

    public String getTarget_id() {
        return target_id;
    }

    public void setTarget_id(String target_id) {
        this.target_id = target_id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
