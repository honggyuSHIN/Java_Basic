package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent=new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child=new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly=new Child();
        poly.parentMethod();

        /*
         Parent poly=new Child();
         new Child() : 자식 타입인 Child를 생성. 자식의 메모리에는 부모도 존재하므로
                메모리에 Child와 Parent가 모두 생성됨.
         생성된 참조값을 Parent타입의 변수인 poly에 넣음.
         -> 부모 타입은 자식 타입을 담을 수 있음.
            하지만 자식 타입은 부모 타입을 담을 수 없음.
            Child child01=new Parent(); 불가능.
         */
        /*
        Parent poly=new Child();
        poly는 주소를 받아서 가면 child와 parent 둘 다 존재함.
        이 때 지금까지 배웠듯이 poly의 타입인 Parent 타입 먼저 확인함.
         */

//        자식의 타입을 담을 수는 있어도 자식의 기능을 호출할 수는 없음.
//        poly.childMethod();
//        불가능. poly의 변수 타입이 Parent이기 때문에 Parent메서드만 호출할 수 있음.
//        poly에 Child 메서드가 있는데 호출은 못함. 어떻게 하면 될까?
//        캐스팅이 필요함.

        /*
        Parent타입의 변수는 자기 자신인 Parent, 자식 타입 뿐만 아니라 손자와 그 하위
        타입도 참조할 수 있음. -> 다양한 형태를 참조할 수 있다고 해서 다형적 참조라 함.
        Parent poly=new Parent();
        Parent poly=new Child();
        Parent poly=new GrandChild();
        -> 부모는 자식을 담을 수 있음.
         */


    }
}
