package extends01.super02;

public class ClassC extends ClassB{
    public ClassC() {
//        super();
        super(10, 20);
        // 선생님 말로는 부모 클래스가 기본생성자일 때에만(개발자가 생성자를 따로 정의하지
        // 않으면 자동으로 생기는 그 기본 생성자) super()를 생략할 수 있고
        // 부모 생성자에 개발자가 생성자를 만들면 자식 클래스에서 부모 생성자 호출
        // super()를 해줘야 함.
        // 근데 ClassB의 경우 ClassA에 생성자를 만들었는데 생략 가능한 걸 보면
        // 부모 생성자에서 매개변수를 받냐 안 받냐 차이 같음.
        System.out.println("ClassC 생성자");

    }
}
