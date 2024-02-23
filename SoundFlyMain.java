package poly.ex06;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        AbstractAnimal[] animals = {dog, chicken, bird};

        for (AbstractAnimal animal : animals) {
            if (animal instanceof Fly) {
                System.out.println("instanceof fly");
            }
            soundAnimal(animal);
            moveAnimal(animal);

        }

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("테스트 끝");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
        System.out.println("테스트 끝");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("동물 날기 테스트 시작");
        fly.fly();
    }
}
