package Final01;

public class ConstructInit {
    final int value;
    // 멤버 변수의 경우 생성자를 통해서 최초 1회 초기화 가능.
    // 생성자가 없을 경우 오류 생김.

    public ConstructInit(int value) {
        this.value = value;
    }
}
