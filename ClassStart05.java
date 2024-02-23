package class01;

public class ClassStart05 {
    public static void main(String[] args) {

        Student student01=new Student();
        student01.name = "학생01";
        student01.age=15;
        student01.grade=90;


        Student student02=new Student();
        student02.name = "학생02";
        student02.age=16;
        student02.grade=80;


//        Student[] students = new Student[]{student01, student02}; 가능
        Student[] students = {student01, student02};

        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            students[0].name = "change";
            int a=10;
            // Student라는 변수 타입으로 변수 s를 만드는 것임.
            // Student 형태의 변수 타입은 name, age, grade를 입력받게 되어있음.
            // 여기에 students[i]가 갖고 있는 "학생01", 15 등을 복사함.
            // 여기에 students[i]의 값들을 복사하여 짧은 변수명으로 활용.

            System.out.println(s.name+"/"+s.age+"/"+s.grade);
        }
//        System.out.println(a);

        // 단축키 iter
        for (Student s : students) {
            System.out.println(s.name);
        }






    }
}
