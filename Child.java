package extends01.super01;

public class Child extends Parent{

    public String value = "child";


    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
    public void call() {
        System.out.println("this.value = " + this.value);
        // this 생략 가능
        // this는 내 타입에서 찾기. 생략하면 원래대로 내 타입에서 먼저 찾음.
        System.out.println("super.value = " + super.value);
        // super는 부모 타입에서 먼저 찾음.

        this.hello();
        super.hello();
        // 본인의 필드 이름과 부모의 필드 이름, 본인의 메서드 이름과 부모의 메서드 이름
        // 이 같지만 super를 사용하여 부모의 필드, 메서드에 접근할 수 있음.
    }


//    public static void main(String[] args) {
//        System.out.println("super.value = " + super.value);
//        super.hello();
        // 왜 main메서드 안에서는 부모 메서드에 접근이 안 되는지?
//    }


}

