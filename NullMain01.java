package ref;

public class NullMain01 {
    public static void main(String[] args) {
        Data data=null;
        System.out.println("1. data = "+data);
        data=new Data();
        System.out.println("2. data = "+data);
        data=null;
        System.out.println("3. data = "+data);

        // null은 참조형 데이터에만 사용할 수 있음.
    }
}
