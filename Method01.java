package ref;

public class Method01 {
    public static void main(String[] args) {
        Student student01=new Student();
        initStudent(student01,"학생1",15,90);

        Student student02=new Student();
        initStudent(student02," 학생2",16,80);
        printStudent(student01);
        printStudent(student02);

    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name=name;
        student.age=age;
        student.grade=grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름 : "+student.name+" 나이 : "+student.age+
                " 성적 : "+student.grade);
    }
    // student02.name은 x002.name과 의미가 같음.

}
