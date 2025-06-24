public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber,String name,double CGPA){
        this.rollNumber=rollNumber;
        this.name=name;
        this.CGPA=CGPA;
    }
    public void modifyCGPA(double cgpa){
        this.CGPA=cgpa;
    }

    public void display(){
        System.out.println(this.name+" "+this.rollNumber+" "+this.CGPA);
    }

    public static class PostgraduateStudent extends Student{
        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }
    }
    public static void main(String[] args){
        Student s1=new Student(2215274,"Alice",9.2);
        s1.modifyCGPA(9.3);
        PostgraduateStudent p1=new PostgraduateStudent(2215123,"Bob",9.1);
        p1.modifyCGPA(8.9);
        s1.display();
        p1.display();
    }
}
