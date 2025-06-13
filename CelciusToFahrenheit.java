import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float celcius=sc.nextFloat();
        float fahrenheit= (float) ((celcius*((float)9/5)) + 32);
        System.out.println(fahrenheit);
    }
}
