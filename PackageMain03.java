package pack;

import pack.a.User;

//import pack.b.User;
public class PackageMain03 {
    public static void main(String[] args) {
        User userA=new User();
        pack.b.User userB=new pack.b.User();
        // a의 User클래스를 User로 사용해버렸기 때문에 이와  분리하기 위해서
        // b의 User클래스를 지칭할 때에는 pack.b.User로 적어야 함.

        // 패키지 이름은 모두 소문자를 사용.(관례)
        // a패키지와 a.b패키지, a.c패키지는 우리 눈으로 보기에만 계층 구조를 이루는 것이고
        // 실제로는 아무런 관련이 없으며 서로 완전히 다른 패키지임.
        // 그러므로 가져올 때 import해서 사용해야 함.
    }
}
