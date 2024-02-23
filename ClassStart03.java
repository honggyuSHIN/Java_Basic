package class01;

public class ClassStart03 {
    public static void main(String[] args) {
        Student student01;

        // 객체 생성.
        student01=new Student();

        // new Student()를 통해 학생에 대한 변수를 만듦.
        // 그 정보(주소)를 student01변수에 저장.
        // student01 변수를 활용해 new Student()를 활용할 수 있는 것.
        // new Student()를 통해 student01과 관련된 메모리 공간을 확보함.

        // new라는 것이 새로 만들라는 뜻?


        student01.name = "학생01";
        student01.age=15;
        student01.grade=90;

        Student student02=new Student();
        // Student student02 : 변수를 만드는 형태. int형 변수를 만들듯이
        // 클래스 Student에 맞는 변수를 만들겠다는 뜻 같음.
        // -> 맞음. 클래스를 사용하면 int, String과 같은 타입 자체를 만들 수 있음.
        //      여기에 필요한 설계도가 클래스임.
        // 그 변수 안을 new Student()를 통해 작은 틀을 만드나?

        student02.name = "학생02";
        student02.age=16;
        student02.grade=80;

        System.out.println("이름 : "+student01.name+"나이 : "+student01.age
        +"성적 : "+student01.grade);
        System.out.println("이름 : "+student02.name+"나이 : "+student02.age
        +"성적 : "+student02.grade);




        /*
        코드 설명
        Student student01;
        Student 타입을 받을 수 있는 변수 선언.
        int는 정수를, String은 문자를 받을 수 있듯이 Student는 Student 타입의 객체를
        받을 수 있음.

        student01=new Student();
        new Student()를 통해 객체를 만듦.
        new : 새로 메모리에 무언가를 생성해라. 무엇을? Student() 클래스의 객체를.
        Student() 클래스의 객체는 String name, int age, int grade를 활용하여 만들어짐.
        객체를 만들 때 메모리 공간을 확보함과 동시에 타입도 결정됨.

        객체를 생성하면 자바는 메모리 어딘가에 있는 데이터에 접근할 수 있는 주소(참조값)
        를 반환해 줌.
        student01변수에는 메모리 주소(x001)가 담겨 있는 것임.

        new Student()는 단순히 만들라는 뜻임. 이름이 없음. 그러므로 만들어 둔 곳에
        접근하기 위한 참조값/주소를 알고 있어야 함.

        객체(Object) : student01, student02는 같은 클래스에서 만들어졌지만
                        서로 다른 객체임.
        인스턴스(Instance) : 객체가 어떤 클래스에 속해 있는지를 강조할 때 주로 사용됨.
                            ex) student01 객체는 Student 클래스의 인스턴스다.






         */

    }
}
