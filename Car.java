package static02.ex;

public class Car {
    private String name;
    private static int cnt=0;


    public Car(String name) {
        this.name=name;
        cnt++;
        System.out.println("차량 구입, 이름 : "+name);
    }
    public static void showTotalCars() {
        System.out.println(cnt);
    }
}
