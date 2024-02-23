package ref;

public class Method02 {
    public static void main(String[] args) {
        Student student01 = createStudent("학생1", 15, 90);
        System.out.println("student01 = " + student01);
        Student student02 = createStudent("학생2", 16, 80);
        System.out.println("student02 = " + student02);

        printStudent(student01);
        printStudent(student02);

    }

    static Student createStudent(String name, int age, int grade) {
        Student student=new Student();
        System.out.println("student = " + student);
        student.name=name;
        student.age=age;
        student.grade=grade;
        return student;
    }

//    static void initStudent(Student student, String name, int age, int grade) {
//        student.name=name;
//        student.age=age;
//        student.grade=grade;
//    }

    static void printStudent(Student student) {
        System.out.println("이름 : "+student.name+" 나이 : "+student.age+
                " 성적 : "+student.grade);
    }
    // student02.name은 x002.name과 의미가 같음.

    /*
    public은 다른 페이지에서 활용하는 것을 허용해주는 기능인 것 같음. 뗐다 붙였다 하기.
    static : 아직 모르겠음.
    void or int or Student : 반환 안 하거나 / int로 반환하거나 / Student로 반환.
    printStudent( ) : 이름.
     */
}
