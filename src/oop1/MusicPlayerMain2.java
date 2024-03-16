package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();
        data.volume = 0;
        data.flag =false;

        data.flag =true;
        System.out.println("음악플레이어를 시작합니다");

        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //볼륨증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 : " + data.flag);
        //음악 플레이어 끄기
        data.flag =false;
        System.out.println("음악 플레이어 를 종료합니다.");
    }
}
