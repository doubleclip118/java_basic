package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 =new MemberConstruct("user1", 15,90);
        MemberConstruct member2 =new MemberConstruct("user2", 16,80);

        MemberConstruct[] members = {member1,member2};
        for (MemberConstruct a : members) {
            System.out.println("이름 " + a.name+"  나이"+a.age+"  성적"+a.grade);
        }
    }

}
