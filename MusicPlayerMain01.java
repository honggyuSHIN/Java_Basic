package oop01;

public class MusicPlayerMain01 {
    public static void main(String[] args) {
        int volume=0;
        boolean isOn=false;

        volume++;
        System.out.println("음악 플레이어 볼륨 : "+volume);
        volume++;
        System.out.println("음악 플레이어 볼륨 : "+volume);
        volume--;
        System.out.println("음악 플레이어 볼륨 : "+volume);

        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn=false;
        System.out.println("음악 플레이어");


    }
}
