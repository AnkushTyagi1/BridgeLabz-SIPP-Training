public class Product {
    private String productName;
    private double price;
    private static int totalProducts=0;

    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }

    public void displatProduct(){
        System.out.println(this.productName+" "+this.price);
    }

    public static void displayTotalProducts(){
        System.out.println(totalProducts);
    }

    public static void main(String[] args){
        Product p1=new Product("mobile",12000.50);
        Product p2=new Product("laptop",89000.40);

        p1.displatProduct();
        p2.displatProduct();

        displayTotalProducts();
    }
}
