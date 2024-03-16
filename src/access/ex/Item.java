package access.ex;

public class Item {
    private String name;
    private int price;
    private int quan;

    public Item(String name, int price, int quan) {
        this.name = name;
        this.price = price;
        this.quan = quan;
    }

    public String getName(){
        return name;
    }

    public int totalPrice(){
        return price*quan;
    }


}
