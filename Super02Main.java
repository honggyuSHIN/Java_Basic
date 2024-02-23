package extends01.super02;

public class Super02Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        // ClassC를 만들면 ClassC 생성자가 생성됨.
        // 따라가보면 바로 ClassB 생성자를 만들고 그것도 따라가보면 바로 ClassA
        // 생성자를 만듦. 그래서 출력이 ClassA, B, C 순서로 나옴.
    }
}
