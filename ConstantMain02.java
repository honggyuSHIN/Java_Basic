package Final01;

public class ConstantMain02 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 "+Constant.MAX_USERS);
        int currentUserCount=999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        // currentUserCount를 process에 대입한 후에 1을 ++함.


    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : "+currentUserCount);
        if (currentUserCount > Constant.MAX_USERS ) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
