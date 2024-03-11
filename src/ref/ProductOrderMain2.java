package ref;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int price,quan,count = 0;
        ProductOrder[] list = new ProductOrder[3];
        name = "두부";
        price = 2000;
        quan = 2;
        list[0] = create(name,price,quan);

        name = "김치";
        price = 5000;
        quan = 1;
        list[1] = create(name,price,quan);

        name = "콜라";
        price = 1500;
        quan = 2;
        list[2] = create(name,price,quan);

        printOders(list);
        getTotalAmount(list);
    }

    static ProductOrder create(String productName,int price, int quantity){
        ProductOrder list = new ProductOrder();
        list.productName=productName;
        list.price=price;
        list.quantity=quantity;
        return list;
    }
    
    static void printOders(ProductOrder[] list){
        for (ProductOrder productOrder : list) {
            System.out.println("상품명: " + productOrder.productName+", 가격: "+productOrder.price+", 수량: "+ productOrder.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] list){
        int sum = 0;
        for (ProductOrder productOrder : list) {
            sum+= productOrder.price* productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
