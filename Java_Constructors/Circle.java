public class Circle {
    double radius;
    public Circle(){
        this.radius=0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public static void main(String[] args){
        Circle c1=new Circle();
        Circle c2=new Circle(12.0);
    }
}
