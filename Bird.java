package poly.ex06;

public class Bird extends AbstractAnimal implements Fly{

    @Override
    void sound() {
        System.out.println("쨱쨱");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
