package static02;

public class DecoMain01 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil01 utils = new DecoUtil01();
        String deco = utils.deco(s);
        System.out.println("s = " + s);
        System.out.println("deco = " + deco);
    }
}
