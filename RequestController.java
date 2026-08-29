public class RequestController {
    public RequestController() {}
    
    public Seed_data data = new Seed_data();

    public int checkRequest(String req, String tar, String role) {
        String id;
        int num = data.role_change_requests.size() + 1;
        if (num < 10) {
            id = "C0" + num;
        } else {
            id = "C" + num;
        }
        if (req.equals(tar)) {
            return 0;
        } 
        else {
            for (int i = 0; i < data.role_change_requests.size(); i++) {
                String rep = data.role_change_requests.get(i).getRequester_id();
                if (rep.equals(rep)) {
                    return 1;
                }
            }
            for (int i = 0; i < Role.values().length; i++) {
                Role roleEnum = Role.values()[i];
                if (roleEnum.name().equals(role)) {
                    data.role_change_requests.add(new Request(id, req, tar, Role.CREATOR, Status.PENDING));
                }
            }
        }
        return 2;
    }
}
