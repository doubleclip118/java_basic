package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();
        data.volume = 0;
        data.flag =false;

        on(data);


        //볼륨증가
        inc(data);
        //볼륨증가
        inc(data);
        //볼륨 감소
        des(data);
        //음악 플레이어 상태
        status(data);
        //음악 플레이어 끄기
        off(data);
    }
    static void on(MusicPlayerData data){
        data.flag =true;
        System.out.println("음악플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data){
        data.flag =false;
        System.out.println("음악플레이어를 종료합니다");
    }
    static void inc(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    static void des(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }
    static void status(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 : " + data.flag+"  볼륨 : "+data.volume);

    }
}
