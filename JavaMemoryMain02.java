package memory;

public class JavaMemoryMain02 {
    public static void main(String[] args) {
        System.out.println("main start");
        // 1. main() 메서드 실행 -> main() 스택 프레임 생성.

        method01();
        // 2. method01() 스택 프레임 생성

        // 8. method01() 스택 프레임 제거.
        // Data 인스턴스를 참조하는 곳이 없어졌기 때문에
        // 자바의 GC(가비지 컬렉션)가 참조가 없는 인스턴스를 모두 제거함.

        System.out.println("main end");
    }

    static void method01() {

        System.out.println("method01 start");
        Data data01 = new Data(10);
        // 3. 지역 변수로 Data data01을 갖고 있음. 지역 변수도 스택 프레임에 포함됨.
        // method01()은 new Data(10)을 사용해서 힙 영역에 Data 인스턴스를 생성함.
        // 참조값은 data01에 저장. / data01은 스택 영역에 존재함. 지역 변수이기 때문에.

        // data01은 처음에는 비어있다가 힙 영역에서 Data인스턴스가 생성되고 난 후
        // 참조값을 받게 됨.

        method02(data01);
        // 4. 위에서 받았던 Data 인스턴스의 참조값을 method02를 호출하면서
        // 매개변수로 넘겨줌.

        System.out.println("method01 end");
    }
    // 7. method01() 종료. method01()의 스택 프레임이 제거됨.
    // 지역변수 data01도 함께 제거됨.
    // 힙 영역에 있는 Data인스턴스를 참조하는 것이 다 없어졌음.


    static void method02(Data data02) {
        // 5. 매개변수 Data data02를 통해 받은 참조값을 통해 Data data01에 접근할 수 있음.
        // method01에 있는 data01과 method02에 있는 data02 지역 변수는
        // 같은 참조값을 가짐. 참조값은 new Data(10)에서 생성된 Data인스턴스를 가리킴.

        System.out.println("method02 start");
        System.out.println("data.value="+data02.getValue());
        System.out.println("method02 end");

    }
    // 6. method 02가 끝나면서 method02()의 스택 프레임이 제거됨.
    // Data 인스턴스를 참조하던 것이 없어짐.
    // 참조값을 갖고 있던 매개변수 data02가 사라졌기 때문?
}
