package construct;

public class MethodInitMain02 {
    public static void main(String[] args) {
        MemberInit member01=new MemberInit();
        InitMember(member01, "user01", 15, 90);

        MemberInit member02=new MemberInit();
        InitMember(member02, "user02", 16, 80);

        MemberInit[] members = new MemberInit[] {member01,member02};

        PrintMember(members);

    }

    static void InitMember(MemberInit member, String name, int age, int grade) {
        member.name=name;
        member.age=age;
        member.grade=grade;
    }

    static void PrintMember(MemberInit[] members) {
        for (MemberInit member : members) {
            System.out.println(member.name);
            System.out.println(member.age);
            System.out.println(member.grade);
        }
    }
}
