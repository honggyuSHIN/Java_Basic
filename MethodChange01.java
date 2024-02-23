package ref;

public class MethodChange01 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("메서드 호출 전 : "+a);
        changePrimitive(a);
        System.out.println("메서드 호출 전 : "+a);
    }

    static void changePrimitive(int x) {
        x=20;
    }
}
