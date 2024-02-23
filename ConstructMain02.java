package construct;

public class ConstructMain02 {
    public static void main(String[] args) {
        MemberConstruct member01 = new MemberConstruct("user01", 15, 90);
        MemberConstruct member02 = new MemberConstruct("user02", 16);
        MemberConstruct member03 = new MemberConstruct(14, 22);

        MemberConstruct[] members = {member01, member02};
        System.out.println("member03 : "+member03.name );
        for (MemberConstruct member : members) {
            System.out.println("이름 : "+member.name+" 나이 : "+member.age
            +" 성적 : " + member.grade);
        }
    }
}
