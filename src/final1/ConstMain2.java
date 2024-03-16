package final1;

import static final1.Constant.MAX_USER;

public class ConstMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수"+1000);
        int currentUserCount = 999;
        currentUserCount++;
        process(currentUserCount);
        currentUserCount++;
        process(currentUserCount);
        currentUserCount++;
        process(currentUserCount);
        currentUserCount++;
        process(currentUserCount);
    }

    private static void process(int currentUserCount){
        System.out.println("참여자 수:" + currentUserCount);
        if(currentUserCount<MAX_USER){
            System.out.println("currentUserCount = " + currentUserCount);
        }
        else{
            System.out.println("대기자로 등록합니다");
        }
    }
}
