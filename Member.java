package Final01.ex;

public class Member {
    private final String id;
    // final은 생성할 때 초기화가 무조건 돼야 하나?
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id=id;       final이라서 안 됨
        this.name=name;
    }
    public void print() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }
}
