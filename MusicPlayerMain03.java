package oop01;

public class MusicPlayerMain03 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        up(data);
        up(data);
        down(data);
        state(data);


        off(data);
        // 음악 플레이어와 관련된 변수들은 한 곳에 모아둠으로써 관리하기 편해짐.
    }

    static void up(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void on(MusicPlayerData data) {
        data.isOn=true;
        System.out.println("음악 플레이어 ON, 볼륨 : "+data.volume);
    }

    static void off(MusicPlayerData data) {
        data.isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void down(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : "+data.volume);
    }

    static void state(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
