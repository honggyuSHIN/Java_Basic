package static01;

public class DataCountMain03 {
    public static void main(String[] args) {
        Data03 data01 = new Data03("A");
        System.out.println("data01.count = " + Data03.count);
        Data03 data02 = new Data03("A");
        System.out.println("data01.count = " + Data03.count);
        Data03 data03 = new Data03("A");
        System.out.println("data01.count = " + Data03.count);

        // data01 객체를 만들 때 static이 붙은 멤버 변수는 인스턴스 영역에 생성되지 않고
        // 메서드 영역에서 관리함.
        // count++를 만나면 인스턴스가 아닌 메서드 영역에 있는 count가 증가함.
        // data02 객체를 만들 때에도 count++ 변수를 만나면 인스턴스 영역이 아닌
        // 메서드 영역으로 가서 count를 증가시킴.

        // 메서드 영역에서 관리한다 -> 공용으로 사용한다.



        // 정적 변수 인스턴스를 통해 접근하기.
        Data03 data04 = new Data03("D");
        System.out.println(data04.count);
        // 정적 변수는 메서드 영역에 존재하지만 인스턴스를 통해 접근해도 static인
        // 것을 확인하고 메서드 영역으로 다시 감.
        // 코드를 쓰는 입장에서 인스턴스 변수인 것처럼 보이기 때문에 권장하지 않음.
        // 노란줄 뜨고 알트 엔터 누르면 수정해줌.

        System.out.println(Data03.count);
        // 메서드 영역으로 바로 접근.
    }
}
