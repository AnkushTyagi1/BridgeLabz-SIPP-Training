public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName="GLA";

    public Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    public void displayCourseDetails(){
        System.out.println(instituteName+" "+this.courseName +" "+this.duration+" "+this.fee);
    }
    public static void updateInstituteName(String str){
        instituteName=str;
    }
    public static void main(String[] args){
        Course c1=new Course("DSA",2,4000.60);
        Course c2=new Course("MERN",5,10000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        updateInstituteName("GLA University");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
