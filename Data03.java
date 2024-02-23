package static01;

public class Data03 {
    public String name;
    public static int count;

    // 용어 정리.
    // name과 count는 둘 다 멤버 변수임.

    // static이 붙지 않은 name 변수는 멤버 변수로서 인스턴스를 생성 해야 사용할 수 있음.
    // -> 멤버 변수임과 동시에 인스턴스 변수임.
    // 인스턴스를 만들 때마다 새로 만들어짐.
    // 만들 때마다 새로 생성되는 변수.

    // count는 static이 붙은 static변수임.
    // static이 붙으면 static 변수, 정적 변수, 클래스 변수라고 함.
    // 인스턴스와 무관하게 클래스에서 바로 접근하여 사용할 수 있음.
    // 클래스 자체에 소속되어 있음.
    // 자바가 실행되면 클래스를 먼저 읽는데 이 때 클래스 변수가 같이 만들어 지는 경우가 많음.
    // 클래스 변수는 자바 프로그램을 시작할 때 딱 1개만 만들어짐.
    // 인스턴스 변수와는 다르게 여러 곳에서 공유하는 목적.
    // 여러 곳에서 접근해도 그 값을 유지하는 변수.

    public Data03(String name) {
        this.name=name;
        count++;
        // 원래는 Data03.count++; 라고 해야 함. 붕어빵 틀에서 관리하는 변수 느낌.
        // 메서드에서 직접 관리하는 변수.
    }

}
