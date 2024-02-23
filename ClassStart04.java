package class01;
// 강의 中 "배열 도입 - 시작" 참고.
public class ClassStart04 {
    public static void main(String[] args) {
        Student student01=new Student();

        student01.name = "학생01";
        student01.age=15;
        student01.grade=90;

        Student student02=new Student();
        student02.name = "학생02";
        student02.age=16;
        student02.grade=80;

        Student[] students=new Student[2];
        // 배열도 참조값을 갖음. new를 통해서 만들기만 하면 의미 없기 때문에 students가
        // 주소(참조값)을 받아와서 접근하게 됨.
        // 배열인 students도 x005와 같은 참조값을 갖고 주소를 따라가보면 그 안에도
        // 건네받은 변수가 참조값이기 때문에 x001, x002와 같은 주소가 들어있음.
        // 이 주소를 따라가면 이제서야 변수(데이터)에 접근할 수 있는 것임.

        // 참조값이 입력되지 않음. 초기값은 null.
        students[0]=student01;
        students[1]=student02;
        // 자바에서 대입은 항상 변수에 들어있는 값 자체를 복사함.
        // student01, student02는 참조값을 갖고 있음. 참조값을 복사해서 주는 것.
        // 그러므로 studnets 배열도 [0] [1] 안에는 그에 맞는 참조값이 들어있음.

        // students[0] 안에 student01을 넣는다고 생각하면 안 됨.
        // students[0] 안에 student01이 갖고 있는 값을 복사해서 넘겨줄 뿐임.

        System.out.println("이름 : "+students[0].name+" 나이 : "+students[0].age
        +"  성적 : "+students[0].grade);
        System.out.println("이름 : "+students[1].name+" 나이 : "+students[1].age
        +" 성적 : "+students[1].grade);

        // students[0].name 코드 분석
        // students 안에는 x005라는 배열 주소가 들어있음.
        // x005라는 주소를 따라가면 두 개의 배열이 나타나는데 그 중 [0]번째 인스턴스에 접근.
        // 그 안에는 x001이라는 주소가 있고 이 주소를 따라가면 name, age, grade 등의
        // 변수가 있는데 그 중 name에 접근.

        // students[1].name 코드 분석(self)
        // students 안에는 그 배열에 접근하는 주소가 들어있음.
        // 따라가면 2개의 인스턴스(?)가 있고 그 중 [1]번에 접근.
        // 배열에 입력받을 때 =student01 형태로 입력 받았기 때문에 student01 안에
        // 들어있던 주소 x002를 그대로 받아왔음. x002를 따라가면 변수들이 있고
        // 그 중 name이라는 변수에 접근.





    }
}
