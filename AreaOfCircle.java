import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float pi=3.14f;
        float area= pi*radius*radius;
        System.out.println(area);
    }
}
