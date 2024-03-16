package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volum = 0;
        boolean flag =false;

        flag =true;
        System.out.println("음악플레이어를 시작합니다");

        //볼륨증가
        volum++;
        System.out.println("음악 플레이어 볼륨 : " + volum);
        //볼륨증가
        volum++;
        System.out.println("음악 플레이어 볼륨 : " + volum);
        //볼륨 감소
        volum--;
        System.out.println("음악 플레이어 볼륨 : " + volum);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 : " + flag);
        //음악 플레이어 끄기
        flag =false;
        System.out.println("음악 플레이어 를 종료합니다.");
    }
}
