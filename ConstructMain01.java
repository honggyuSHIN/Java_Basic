package construct;

public class ConstructMain01 {
    public static void main(String[] args) {
        MemberConstruct member01 = new MemberConstruct("user01", 15, 90);
        MemberConstruct member02 = new MemberConstruct("user02", 16, 80);

        MemberConstruct[] members = {member01, member02};

        for (MemberConstruct member : members) {
            System.out.println("member.name = " + member.name);
            System.out.println("member.age = " + member.age);
            System.out.println("member.grade = " + member.grade);
        }
    }
}
