package constructor;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 19, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 20, 91);

        MemberInit member3 = new MemberInit();
        member3.initMember("user3", 21, 92);

        MemberInit[] members = {member1, member2, member3};

        for (MemberInit member : members) {
            System.out.println("name: " + member.name + " age: " + member.age + " grade: " + member.grade);
        }
    }
}
