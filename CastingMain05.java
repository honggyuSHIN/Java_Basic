package poly.basic;

public class CastingMain05 {
    public static void main(String[] args) {
        Parent parent01 = new Parent();
        call(parent01);
        Parent parent02 = new Child();
        call(parent02);
    // Child에 extends Parent를 쓰지 않는다면 Child 메모리에 부모 메모리가 포함되지
    // 않으므로 Parent 타입의 변수에 Child() 타입의 데이타를 넣을 수 없음.

    }
    private static void call(Parent parent) {
        System.out.println("start");
        parent.parentMethod();
        // parentMethod() 호출하고 만약 Child 타입이면 childMethod()도 호출하는 코드.
        if (parent instanceof Child) {

            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
        if (parent instanceof Parent) {
            System.out.println("Parent 인스턴스 맞음");
        }
        /*
        new Parent()로 생성된 parent01은 instanceof Parent에만 해당됨.
        new Child()로 생성된 parent02의 경우 instanceof Child와 instanceof Parent
        둘 다에 속함.
        Child()에는 Parent()도 속하기 때문에 Parent의 인스턴스이기도 한 것 같다.
         */
//        else {
//            System.out.println("Child 인스턴스 아님");
//        }

    }

    /*
    parent instanceof Child 해석
    new Parent()로 만들어진 parent01이 올 경우
    new Parent() instanceof Child 로 해석 -> false

    new Child()로 만들어진 parent02가 올 경우
    new Child() instance of Child 로 해석 -> true

     */

    /*
    instanceof 키워드는 오른쪽 대상의 타입을 왼쪽에서 참조하는 경우에도
    true를 반환함. 한 마디로 왼쪽이 자식 오른쪽이 부모이면 true라는 뜻 같음.
    자식은 부모를 참조하니까.

    New Parent() instanceof Parent : 같은 타입. true
    New Child() instanceof Parent : 부모는 자식을 담을 수 있다. true.
        Child()의 메모리에는 Parent()도 존재함.
    New Parent() instanceof Child : 자식은 부모를 담을 수 없다. false
    new Child() instanceof Child : 같은 타입.

    -> 앞 뒤를 바꿔서 Child c= new Child() 로 바꿔서 대입이 되는지 생각해도 됨.



     */
}
