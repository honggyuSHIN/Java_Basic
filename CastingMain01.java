package poly.basic;

public class CastingMain01 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly=new Child();
        poly.parentMethod();
        // 단, 자식의 기능은 호출할 수 없음. 컴파일 오류 발생.
        // poly.childMethod();

        // 다운캐스팅 : 부모 타입 -> 자식 타입
//        Child child=poly;
//        오류 발생. poly에 들어있는 Parent 타입 주소를 child에 주려고 하는데
//              오류가 생길 가능성이 커서 자바에서 못 하게 함. -> 명시적으로 표시하면 됨.
        Child child=(Child)poly;
        // 캐스팅.
        // 명시적으로 개발자가 책임지겠다고 선언함으로써 부모 타입의 참조값을 갖고 있는
        // poly를 자식 타입에 전달함.
        // = 는 값을 복사하여 전달하는 것.
        // 따라서 캐스팅 한다고 해서 poly의 타입이 변하는 것은 아님.

        // upcasting : 부모 타입으로 변경.
        // downcasting : 자식 타입으로 변경.



    }
}
