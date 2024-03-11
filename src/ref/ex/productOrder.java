package ref.ex;

import ref.ProductOrder;

import java.util.Scanner;

public class productOrder {
    public static void main(String[] args) {
        product[] list = new product[3];
        String name;
        int price,quan,loop;
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        loop = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<loop;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            name = scanner.nextLine();
            System.out.print("가격: ");
            price = scanner.nextInt();
            System.out.print("수량: ");
            quan = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비
            list[i] = create(name,price,quan);
        }
        printOders(list);
        getTotalAmount(list);
    }

    static product create(String name, int price, int quan){
        product list = new product();
        list.name = name;
        list.price = price;
        list.quan = quan;
        return list;
    }

    static void printOders(product[] list){
        for (product productOrder : list) {
            System.out.println("상품명: " + productOrder.name+", 가격: "+productOrder.price+", 수량: "+ productOrder.quan);
        }
    }

    static void getTotalAmount(product[] list){
        int sum = 0;
        for (product productOrder : list) {
            sum+= productOrder.price* productOrder.quan;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
