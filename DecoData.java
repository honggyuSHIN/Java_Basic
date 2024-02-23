package static02;



public class DecoData {
    private int instanceValue;
    private static int staticValue;     // 클래스 소속

    public static void staticCall() {   // 클래스 소속
//        instanceValue++;   // 인스턴스 변수에 접근 불가능.
//        instanceMethod();     // 인스턴스 메서드에 접근 불가능.
        // 인스턴스는 생성이 되고 주소를 알아야 접근할 수 있는데
        // static에서는 알 수가 없음. 붕어빵 틀에서는 붕어빵에 대해 알지 못 함.

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }
    public void instanceCall() {
        instanceValue++;        // 인스턴스 변수에 접근
        instanceMethod();       // 인스턴스 메서드에 접근
        // 인스턴스 메서드가 호출 되면 인스턴스 변수들도 생성됨. -> 갖다 쓰면 됨.

        staticValue++;          // static 변수에 접근 가능
        // DecoData.staticValue++; 와 같은 의미. 자기 자신이기 때문에 생략.
        staticMethod();         //static 메서드에 접근 가능
        // DecoData.staticMethod(); 와 같은 의미.
    }
    public void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }private static void staticMethod() {   // 클래스 소속
        System.out.println("staticValue = " + staticValue);
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
        // 당연한 얘기지만 static 메서드도 매개변수를 통해서는 인스턴스에 접근 가능.
        // 구체적인 대상을 생성한 후 특정하여 참조값을 넘겨주기 때문.
    }
}
