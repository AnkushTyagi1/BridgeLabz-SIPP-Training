public class Circle {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void Area(){
        System.out.println(3.14*this.radius*this.radius);
    }
    public void Circumference(){
        System.out.println(2*3.14*this.radius);
    }
    public static void main(String[] args){
        Circle c1=new Circle(10);
        c1.Area();
        c1.Circumference();
    }
}
