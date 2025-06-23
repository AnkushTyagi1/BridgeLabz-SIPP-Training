public class MobilePhone {
    String brand;
    String model;
    double price;
    public MobilePhone(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void display(){
        System.out.println(this.brand);;
        System.out.println(this.model);
        System.out.println(this.price);
    }
    public static void main(String[] args){
        MobilePhone m1=new MobilePhone("OPPO","A52",15000);
        m1.display();
    }
}
