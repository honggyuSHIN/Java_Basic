package pack;

import pack.a.*;
// pack.a. 아래에 있는 클래스 모두에 접근 가능.

public class PackageMain02 {
    public static void main(String[] args) {
        Data data = new Data();
        // 같은 패키지의 클래스에 접근할 때에는 그냥 적으면 되고
        User user=new pack.a.User();
        // 다른 패키지에 접근할 때에는 풀 네임을 적어줘야 함.
        User02 user02=new User02();
    }
}
