package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();
//kakao 결제
        while(true){
            System.out.println("결제 수단을 입력하세요:");
            String payOption = scanner.nextLine();

            if(payOption.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
            

            System.out.println("결제 금액을 입력하세요");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);

        }

    }
}

