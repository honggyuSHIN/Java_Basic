package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(int age, int grade) {
        this("dd", age, grade);
    }

    MemberConstruct(String name) {
        this(name, 3);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출, name = " + name + ", age = " + age +
                "grade = " + grade);
        this.name=name;
        this.age=age;
        this.grade=grade;

        // 생성자의 이름은 클래스의 이름과 같다.
        // 생성자는 반환 타입이 없다.
        // 다른 부분들은 메서드와 같다
        // 생성자는 반드시 호출되므로 매개변수를 전달하지 않으면 오류가 생김.
        // -> 반드시 실행되어야 하는 코드 안에 넣기.

        // 생성자룔 생성하지 않으면 자바는 매개변수가 없는 빈 코드로 이루어진
        // 기본 생성자를 만들어서 실행함.(의미는 없음. 코드가 비어 있으니까)
        // 하지만 생성자가 있으면 기본 생성자를 만들지 않음.
    }


}
