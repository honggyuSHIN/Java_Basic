package poly.basic;

public class CastingMain02 {
    public static void main(String[] args) {
        Parent poly=new Child();
        poly.parentMethod();

        Child child=(Child)poly;

        // 일시적 다운캐스팅 : 해당 메서드를 호출하는 순간만 다운캐스팅
//        (child) poly.childMethod() : 연산의 우선 순위가 poly.childMethod()가 우선.

        ((Child) poly).childMethod(); // ()를 한번 더 씌워줌으로써 해결.
        // poly가 Child 타입으로 바뀌는 것이 아님에 유의.
        // poly에서 참조값 x001을 잠깐 복사해서 꺼낸 후에 이걸 Child 타입으로 사용함.
        // -> poly는 여전히 Parent 타입이고 참조값을 잠깐 복사해서 Child 타입으로
        //      사용했을 뿐임.


    }
}
