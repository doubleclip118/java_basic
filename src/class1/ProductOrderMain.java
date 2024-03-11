package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] list = new ProductOrder[3];

        list[0] = new ProductOrder();
        list[1] = new ProductOrder();
        list[2] = new ProductOrder();

        list[0].productName = "두부";
        list[0].price = 2000;
        list[0].quantity = 2;

        list[1].productName = "김치";
        list[1].price = 5000;
        list[1].quantity = 1;

        list[2].productName = "두부";
        list[2].price = 1500;
        list[2].quantity = 2;
        int sum = 0;
        for (ProductOrder productOrder : list) {
            System.out.println("상품명: " + productOrder.productName+", 가격: "+productOrder.price+", 수량: "+productOrder.quantity);
            sum+= productOrder.price*productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
