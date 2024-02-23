package construct;

public class MethodInitMain01 {
    public static void main(String[] args) {
        MemberInit member01=new MemberInit();
        member01.name = "user01";
        member01.age=15;
        member01.grade=90;

        MemberInit member02=new MemberInit();
        member02.name = "user02";
        member02.age=15;
        member02.grade=90;

        MemberInit[] members = new MemberInit[] {member01,member02};

        for (MemberInit member : members) {
            System.out.println(member.name);
            System.out.println(member.age);
            System.out.println(member.grade);
        }
    }
}
