package poly.basic;

public class CastingMain06 {
    public static void main(String[] args) {
        Parent parent01 = new Parent();
        call(parent01);
        Parent parent02 = new Child();
        call(parent02);

    }
    private static void call(Parent parent) {
        System.out.println("start");
        parent.parentMethod();
        if (parent instanceof Child child) {
            // parent가 Child 인스턴스라는 게 보장되면 Child 타입으로 child라는
            // 변수를 생성함.

            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;
//            16부터 instanceof 사용과 동시에 변수 선언이 가능해짐. 생략 가능.
            child.childMethod();
        }
        if (parent instanceof Parent) {
            System.out.println("Parent 인스턴스 맞음");
        }

    }

}
