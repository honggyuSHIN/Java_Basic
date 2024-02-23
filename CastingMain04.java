package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain04 {
    public static void main(String[] args) {
        Parent parent01=new Child();
//        업캐스팅은 가능.
//        Child child01=parent01;
//        Child 타입이 들어있는 Parent 타입의 변수라고 하더라도 Parent는 Parent임.
        Child child01=(Child)parent01;
        child01.childMethod();  // 문제 없음.
//        처음 생성을 new Child()로 했기 때문에 Child는 부모 타입도 다 생성함.
//        기존의 parent01의 경우 Child에 대해 접근만 못 하는 거지 Child가 존재는 했음.

        Parent parent02=new Parent();
        Child child02=(Child)parent02;
        // 런타임 오류 - ClassCastException
//        ((Child) parent02).childMethod();
//        child02.childMethod();
//
//        new Parent()로 부모 타입의 객체를 생성함. 따라서 메모리에 자식 타입에 대한
//        데이터가 존재하지 않음. 메모리는 자식 타입을 모르니까.
//        따라서 parent02를 Child 타입으로 다운캐스팅 해도 Child에 대한 데이터가 없음.
//        -> ClassCastException 오류 발생.

//        업캐스팅의 경우 이러한 문제가 절대 발생하지 않음. 객체를 생성하면 해당 타입의
//        상위 부모 타입은 모두 함께 생성되기 때문. 따라서 위로만 타입을 변경하는
//        업캐스팅의 경우 메모리 상에 인스턴스가 모두 존재하므로 안전함. -> 생략 가능

//        하지만 다운캐스팅의 경우 객체를 생성하면 자식 타입은 생성이 되지 않기 때문에
//        인스턴스에 존재하지 않는 하위 타입으로 캐스팅 하는 경우가 발생할 수 있음.
//        -> 명시적으로 표시 해줘야 함.

//
//    컴파일 오류 : 변수명 오타, 잘못된 클래스 이름 사용 등 자바 프로그램을 실행하기 전에
//            발생하는 오류임. IDE에서 즉시 확인할 수 있기 때문에 좋은 오류.
//    런타임 오류 : 프로그램이 실행되고 있는 시점에 발생하는 오류. 고객이 프로그램을
//            실행하는 도중에 발생함. 안 좋은 오류.




    }

}
