package static02;

//import static static02.DecoData.staticCall;
// static02.DecoData에 있는 staticCall을 import하여 계속 사용하겠다는 뜻.
import static static02.DecoData.*;
// ststic02.DecoData에 있는 모든 클래스 및 메서드를 사용하겠다는 뜻.

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        DecoData.staticCall();
        // 당연히 그냥 이렇게 써도 됨.
        staticCall();
        staticCall();
//        DecoData.staticValue++;

        System.out.println("2. 인스턴스 호출");
        DecoData data01=new DecoData();
        data01.instanceCall();

        System.out.println("3. 인스턴스 호출02");
        DecoData data02=new DecoData();
        data02.instanceCall();


        // 인스턴스를 통한 접근
        DecoData data03= new DecoData();
        staticCall();
        // 클래스 소속이지만 인스턴스 소속으로 보이기 때문에 좋은 코드가 아님.

        // 클래스를 통한 접근
        staticCall();
        // 반면에 이렇게 클래스를 통해서 접근하면 바로 static 형식이라는 것을 알 수 있음.

    }
}
