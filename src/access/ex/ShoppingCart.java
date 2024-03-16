package access.ex;

public class ShoppingCart {
    private Item[] list = new Item[10];
    private int index = 0;

    public ShoppingCart() {
    }
    public void addItem(Item it){
        if(index<list.length){
            list[index]=it;
            index++;
        }
        else{
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }
    public void displayItems(){
        for (int i=0; i<index;i++) {
            System.out.println("상품명:" + list[i].getName()+", 합계:"+list[i].totalPrice());
        }
    }
}
