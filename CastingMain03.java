package poly.basic;

public class CastingMain03  {
    public static void main(String[] args) {
        Child child=new Child();
        Parent parent01=child;  // 가능
        Parent parent02=(Parent)child;
        // 원래 이건데 업캐스팅은 생략 가능함. 권장.
        // 다른 타입이 그냥 들어가는 건 없음.

        parent01.parentMethod();
        parent02.parentMethod();
    }



}

