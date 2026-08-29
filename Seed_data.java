import java.util.ArrayList;

public class Seed_data {
  public ArrayList<Member> members = new ArrayList<>();
  public ArrayList<Request> role_change_requests = new ArrayList<>();
  public ArrayList<Decisions> decisions = new ArrayList<>();

  public Seed_data() {
    // Memebers Data
    members.add(new Member(
      "M01",
      "คุยกันได้",
      Role.PRODUCER,
      true
    ));
    members.add(new Member(
      "M02",
      "ใบเสร็จอยู่ไหน",
      Role.FINANCE,
      true
    ));
    members.add(new Member(
      "M03",
      "ตัดคลิปก่อน",
      Role.EDITOR,
      true
    ));
    members.add(new Member(
      "M04",
      "เพื่อนกันตลอดไป",
      Role.CREATOR,
      true
    ));
    members.add(new Member(
      "M05",
      "อ่านแชตย้อนหลัง",
      Role.CREATOR,
      true
    ));

    // role_change_requests Data
    role_change_requests.add(new Request(
      "C01",
      "M01",
      "M02",
      Role.EDITOR,
      Status.PENDING
    ));
    role_change_requests.add(new Request(
      "C02",
      "M02",
      "M03",
      Role.CREATOR,
      Status.PENDING
    ));
    role_change_requests.add(new Request(
      "C03",
      "M03",
      "M04",
      Role.EDITOR,
      Status.PENDING
    ));
    role_change_requests.add(new Request(
      "C04",
      "M04",
      "M05",
      Role.PRODUCER,
      Status.PENDING
    ));

    // Decisions Data
    decisions.add(new Decisions(
      "C01",
      "M03",
      Status.APPROVE
    ));
    decisions.add(new Decisions(
      "C02",
      "M04",
      Status.REJECT
    ));
    decisions.add(new Decisions(
      "C04",
      "M01",
      Status.APPROVE
    ));
  }

  public ArrayList<Member> getMembers() {
    return members;
  }

  public void setMembers(ArrayList<Member> members) {
    this.members = members;
  }

  public ArrayList<Request> getRole_change_requests() {
    return role_change_requests;
  }

  public void setRole_change_requests(ArrayList<Request> role_change_requests) {
    this.role_change_requests = role_change_requests;
  }

  public ArrayList<Decisions> getDecisions() {
    return decisions;
  }

  public void setDecisions(ArrayList<Decisions> decisions) {
    this.decisions = decisions;
  }
}
// {
//   "members": [
//     {
//       "id": "M01",
//       "name": "คุยกันได้",
//       "role": "PRODUCER",
//       "active": true
//     },
//     {
//       "id": "M02",
//       "name": "ใบเสร็จอยู่ไหน",
//       "role": "FINANCE",
//       "active": true
//     },
//     {
//       "id": "M03",
//       "name": "ตัดคลิปก่อน",
//       "role": "EDITOR",
//       "active": true
//     },
//     {
//       "id": "M04",
//       "name": "เพื่อนกันตลอดไป",
//       "role": "CREATOR",
//       "active": true
//     },
//     {
//       "id": "M05",
//       "name": "อ่านแชตย้อนหลัง",
//       "role": "CREATOR",
//       "active": true
//     }
//   ],
//   "role_change_requests": [
//     {
//       "id": "C01",
//       "requester_id": "M01",
//       "target_id": "M02",
//       "new_role": "EDITOR",
//       "status": "PENDING"
//     },
//     {
//       "id": "C02",
//       "requester_id": "M02",
//       "target_id": "M03",
//       "new_role": "CREATOR",
//       "status": "PENDING"
//     },
//     {
//       "id": "C03",
//       "requester_id": "M03",
//       "target_id": "M04",
//       "new_role": "EDITOR",
//       "status": "PENDING"
//     },
//     {
//       "id": "C04",
//       "requester_id": "M04",
//       "target_id": "M05",
//       "new_role": "PRODUCER",
//       "status": "PENDING"
//     }
//   ],
//   "decisions": [
//     {
//       "request_id": "C01",
//       "member_id": "M03",
//       "result": "APPROVE"
//     },
//     {
//       "request_id": "C02",
//       "member_id": "M04",
//       "result": "REJECT"
//     },
//     {
//       "request_id": "C04",
//       "member_id": "M01",
//       "result": "APPROVE"
//     }
//   ]
// }