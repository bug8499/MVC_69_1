public class Request {
    private String id;
    private String requester_id;
    private String target_id;
    private Role new_role;
    private Status status;

    public Request(String id, String requester_id, String target_id, Role new_role, Status status) {
        this.id = id;
        this.requester_id = requester_id;
        this.target_id = target_id;
        this.new_role = new_role;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Role getNew_role() {
        return new_role;
    }

    public void setNew_role(Role new_role) {
        this.new_role = new_role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
