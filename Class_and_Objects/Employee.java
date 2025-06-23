public class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee id : "+this.id);
        System.out.println("Employee salary : "+this.salary);
    }
    public static void main(String[] args){
        Employee E1=new Employee("Alice","Alice@gmail.com",100000);
        E1.display();
    }
}
