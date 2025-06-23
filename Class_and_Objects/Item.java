public class Item {
    String itemCode;
    String itemName;
    double price;
    public Item(String itemCode,String itemName,double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    public void price(int quantity){
        System.out.println(this.price*quantity);
    }
    public static void main(String[] args){
        Item A=new Item("xyx","toy",100);
        A.price(2);
    }
}
