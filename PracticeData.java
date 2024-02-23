package construct.practice;

public class PracticeData {
    String name;
    int age;
    int avg;

    PracticeData(String name02, int age, int avg) {
        System.out.println("생성자 생성됨.");
        name=name02;
        this.age=age;
        this.avg=avg;
    }

    PracticeData(String name, int age) {
        this(name, 50, age);
    }

}
