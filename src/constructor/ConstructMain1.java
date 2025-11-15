package constructor;

public class ConstructMain1 {
    public static void main (String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 60);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 70);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println(member.name + " " + member.age + " " + member.grade);
        }
    }
    // 생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다.
}
