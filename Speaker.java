package access;

public class Speaker {
    private int volume;
    // private를 활용하여 volume필드를 speaker 내부에 숨김.

    Speaker(int volume) {
        this.volume=volume;
    }

    void volumeUp() {
        if (volume < 100) {
            volume+=10;
            System.out.println("음량이 10 증가합니다.");
        } else {
            System.out.println("100이 최대입니다.");
        }
    }
    void volumeDown() {
        if (volume > 0) {
            volume-=10;
            System.out.println("음량이 10 감소합니다.");
        } else {
            System.out.println("0이 최소입니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 : "+volume);
    }


    // 변수 및 메서드에 대한 보안? 설정.
    // private : 모든 외부 호출을 막음.
    // default(package-private) : 같은 패키지 안에서 호출은 허용.
        // ex) int a;   ->    디폴트로 적용되는 옵션임.
    // protected : 같은 패키지 안에서의 호출은 허용.
    //          패키지가 달라도 상속 관계의 호출은 허용.
    // public : 모든 외부 호출을 허용.
    //
    // 지역 변수에는 접근 제어자 사용x -> 어차피 그 지역 안에서만 접근 가능함.
}
