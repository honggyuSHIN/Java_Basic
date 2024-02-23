package Final01;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data01;
        data01=10;
        // final은 최초에 한번만 할당 가능.
//        data01=20;

        final int data02=10;
//        data02=20;     컴파일 오류. 최초 한번만 할당 가능.
    }

    static void method(final int parameter) {
//        parameter=20;     // 컴파일 오류
    }
}
