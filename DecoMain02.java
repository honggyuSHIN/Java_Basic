package static02;

public class DecoMain02 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil02.deco(s);
        // static이 붙은 메서드는 클래스 소속이기 때문에 인스턴스를 만들지 않아도
        // 생성되어 있음.
        System.out.println("s = " + s);
        System.out.println("deco = " + deco);
    }
}
