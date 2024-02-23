package construct;

public class MethodInitMain03 {
    public static void main(String[] args) {
        MemberInit  member01=new MemberInit();
        member01.initMember( "user01", 15, 90);

        MemberInit member02=new MemberInit();
        member02.initMember( "user02", 16, 80);

        MemberInit[] members = new MemberInit[] {member01,member02};

        PrintMember(members);

    }
    static void PrintMember(MemberInit[] members) {
        for (MemberInit member : members) {
            System.out.println(member.name);
            System.out.println(member.age);
            System.out.println(member.grade);
        }
    }
}
