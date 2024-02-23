package extends01.super02;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super();
        // 부모 생성자 생성. 원래 적어야 하는데 생략하면 자바가 알아서 해줌.
        // ClassB는 ClassA를 상속 받았음. 상속 받으면 생성자의 첫줄에 super(...)를
        // 사용하여 부모 클래스의 생성자를 호출해야 함.

        // 예외로 첫 줄에 this(...)를 사용할 수 있지만
        // (this는 같은 클래스 내의 다른 생성자로 가달라는 뜻.)
        // 여러 생성자들 중 어느 한 생성자는 부모 생성자를 첫 줄에 호출해야 함.
        // 첫 줄에 this를 100번 사용해도 언젠가 한 번은 첫 줄에 super가 나와야 함.

        // -> 결과적으로 상속 관계의 생성자 호출은 부모 먼저 생성됨.
        //      부모 데이터 먼저 초기화하고 그 다음에 자식 데이터를 초기화 함.

        System.out.println("ClassB 생성자 a = "+a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a = "+a+"b + "+b);
    }
}
