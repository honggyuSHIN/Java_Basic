package Final01;

public class ConstantMain01 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 "+1000);
        int currentUserCount=999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        // currentUserCount를 process에 대입한 후에 1을 ++함.


    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : "+currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
    // 이 코드를 처음 본 사람은 1000의 의미가 무엇인지 모름.
    // 또한 1000명을 2000명으로 늘리려 하면 여러 곳에서 숫자를 바꿔줘야 함.
    // MAX_USERS라는 상수를 통해 문제를 해결. ConstantMain02 클래스에서 설명.
    // -> 상수를 통해 값을 중앙에서 관리.
}
