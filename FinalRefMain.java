package Final01;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data=new Data();
//        data=new Data();
//        컴파일 오류 : final로 만들어진 data 참조형 변수에 다른 값을 넣을 수 없음.

        // final로 인해 참조값이 바뀌지 않는 대상의 값은 변경 가능함.
        data.value=10;
        System.out.println(data.value);
        data.value=20;
        System.out.println(data.value);


    }

}
