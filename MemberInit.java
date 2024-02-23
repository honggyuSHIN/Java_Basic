package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name02, int age, int grade) {
        this.name=name02;
        this.age=age;
        this.grade=grade;
        // 같은 이름을 가진 변수가 여러 개 있을 경우 가까운 스코프의 변수를
        // 먼저 가져옴.
        // -> this를 붙여줌으로써 멤버 변수라는 의미를 붙여줌.
        //      this는 인스턴스 자기 자신의 참조값(x001)을 의미함.
        // 먼저 지역 변수(매개변수) 범위에서 찾고 없으면 멤버 변수에서 찾음.
    }
}
