package extends01.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar=new ElectricCar();
        electricCar.move();
        // move() 메서드는 ElectricCar 타입과 그 부모인 Car()에 둘 다 존재하지만
        // 메서드를 확인할 때 본인의 메서드를 먼저 확인하기 때문에 부모까지 확인하지 않음.

        GasCar gasCar=new GasCar();
        gasCar.move();

        /*
        <메서드 오버라이딩 조건>
        pdf 참고.
        static : 오버라이딩은 인스턴스 레벨에서 돌아가는 것임. static은 클래스 레벨에서
            작동하므로 오버라이딩이 의미가 없음. 클래스 이름을 통해 필요한 곳에 직접
            접근하면 된다.(?)

        final : 메서드에 final이 붙으면 메서드 재정의를 할 수 없는데 오버라이딩이
            메서드 재정의이다.

        private : private를 붙이면 클래스 속으로 메서드를 숨기는 것임.
            해당 클래스에서만 접근 가능.
            오버라이딩을 하려면 부모의 메서드를 확인해야 하므로 불가능.

        생성자도 오버라이딩 불가능

         */
    }
}
