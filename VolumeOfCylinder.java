import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float height= sc.nextFloat();
        float pi=3.14f;
        float volume= pi*radius*radius*height;
        System.out.println(volume);
    }
}
