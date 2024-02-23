package static02.ex;

public class MathArrayUtils {

    public static int sum(int[] values) {
        int sum=0;

        for (int value : values) {
            sum+=value;
        }
        return sum;
    }

    public static double average(int[] values) {
        double avg= (double) sum(values)/values.length;
        return avg;
    }

    public static int min(int[] values) {
        int start=values[0];
        for (int value : values) {
            if (start > value) {
                start=value;
            }

        }return start;
    }

    public static int max(int[] values) {
        int max=values[0];
        for (int value : values) {
            if (max < value) {
                max=value;
            }
        }
        return max;
    }

    private MathArrayUtils() {
        // private을 통해 인스턴스 생성을 막음.
    }
}
