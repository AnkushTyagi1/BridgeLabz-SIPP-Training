public class Student {
    String name;
    int rollNumber;
    int marks;
    char Grade;
    public Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void Grade(){
        int marks=this.marks;
        if(marks>=90){
            this.Grade='A';
        }else if(marks>=80){
            this.Grade='B';
        }else{
            this.Grade='C';
        }
    }
    public void print(){
        System.out.println("Student's Name : "+this.name);
        System.out.println("Student's RollNumber : "+this.rollNumber);
        System.out.println("Student's Marks : "+this.marks);
        System.out.println("Grade : "+this.Grade);
    }
    public static void main(String[] args){
        Student s1=new Student("Alice",123,88);
        s1.Grade();
        s1.print();
    }
}
