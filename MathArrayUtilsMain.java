package static02.ex;

import static static02.ex.MathArrayUtils.*;
// static메서드를 import하여 사용하겠다는 뜻.

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));

    }
}