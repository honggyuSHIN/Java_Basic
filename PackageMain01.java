package pack;

public class PackageMain01 {
    public static void main(String[] args) {
        Data data = new Data();
        // 같은 패키지의 클래스에 접근할 때에는 그냥 적으면 되고
        pack.a.User user=new pack.a.User();
        // 다른 패키지에 접근할 때에는 풀 네임을 적어줘야 함.
    }
}
