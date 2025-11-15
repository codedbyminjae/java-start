package constructor;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 20;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 22;
        member2.grade = 80;

        MemberInit[] members = new MemberInit[2];
        MemberInit[] temp = {member1, member2};

        for (int i = 0; i < members.length; i++) {
            members[i] = temp[i];
        }

        for (MemberInit memberInit : temp) {
            System.out.println("이름 : " + memberInit.name + "나이 : " + memberInit.age + "성적 : " + memberInit.grade);
        }
    }
}
