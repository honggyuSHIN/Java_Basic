package static02;

public class DecoUtil02 {

    public static String deco(String str) {
        // 정적 메서드 생성. -> 정적 메서드 / 클래스 메서드라 칭함.
        // 정적 메서드는 정적 변수처럼 클래스 명을 통해서 바로 호출할 수 있음.
        // static이 붙이 않은 메서드는 인스턴스 메서드라 함. -> 인스턴스 생성해야 호출 가능.

        String result="*"+str+"*";
        return result;
    }
}
