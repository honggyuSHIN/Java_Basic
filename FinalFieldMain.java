package Final01;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화       final타입의 필드 변수.
        System.out.println("생성자 초기화");
        ConstructInit constructInit01 = new ConstructInit(10);
        ConstructInit constructInit02 = new ConstructInit(20);
        System.out.println(constructInit01.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit01=new FieldInit();
        FieldInit fieldInit02=new FieldInit();
        FieldInit fieldInit03=new FieldInit();
        System.out.println(fieldInit01.value);
        System.out.println(fieldInit02.value);
        System.out.println(fieldInit03.value);
        // 바뀌지 않는 값을 여러 번 생성하여 메모리르 낭비하고 있음.
        // static final을 사용하여 공용 변수를 만들면 낭비를 줄일 수 있음.

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        /*
        <변수와 상수>
        상수 : 변하지 않고 항상 일정한 값을 갖는 수를 뜻함.
            단 하나만 존재하는 변하지 않는 고정된 값을 상수라 함.
             -> static final 사용.
            대문자를 사용하고 _로 구분(관례)
            필드에 직접 접근해서 사용. 기능이 아니라 고정된 값 자체를 사용하는 것이 목표
            값을 변경할 수 없기 때문에 필드에 직접 접근해서 데이터가 변하지 않음.



         */
    }
}
