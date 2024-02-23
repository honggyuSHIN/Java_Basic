package extends01.overriding;

public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    // 부모인 Car의 move() 기능을 그대로 사용하고 싶지 않음.
    // 메서드 이름은 같지만 새로운 기능을 사용하고 싶음. -> move() 메서드를 새로 만듦.
    // ElectricCar의 move()를 호출하면 Car의 move()가 아니라 ElectricCar()의
    // move()가 호출됨

    // @Override
    // @이 붙은 부분을 애노테이션이라 함. 애노테이션은 주석과 비슷한데 프로그램이 읽을 수
    // 있는 특별한 주석이라고 생각하면 됨.
    // 상위 클래스의 메서드를 오버라이드하는 것임을 나타냄.

    // @OVerride는 없어도 기능은 하지만 꼭 붙임.
    // 그 이유는 실수로 메서드 이름을 movee로 했을 때 @Override를 써놓지 않으면
    // 이유를 알 수 없지만 @Override를 써놓으면 메서드 이름이 달라도 자바가 확인하고
    // 오류를 냄로써 알려줌.

    public void charge() {
        System.out.println("충전합니다.");
    }
}
