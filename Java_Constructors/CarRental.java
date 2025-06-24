import java.util.Scanner;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String name,String carModel,int rentalDays){
        this.customerName=name;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    public void cost(){
        System.out.println(this.rentalDays * 1200);
    }
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String name=sc.nextLine();
        System.out.print("Enter car model : ");
        String model=sc.next();
        System.out.print("Enter total rental Days : ");
        int days=sc.nextInt();

        CarRental c1=new CarRental(name,model,days);
        c1.cost();
    }
}
