public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(Person p1){
        this.name=p1.name;
        this.age=p1.age;
    }
    public void display(){
        System.out.println(this.name+" "+this.age);
    }
    public static void main(String[] args){
        Person p1=new Person("Alice",12);
        Person p2=new Person(p1);
        p1.display();
        p2.display();
    }
}
