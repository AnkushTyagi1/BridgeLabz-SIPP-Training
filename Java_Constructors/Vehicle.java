public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee=100;

    public Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public void displayVehicleDetails(){
        System.out.println(this.ownerName+" "+this.vehicleType+" "+registrationFee);
    }
    public static void updateRegistrationFee(double price){
        registrationFee=price;
    }

    public static void main(String[] args){
        Vehicle v1=new Vehicle("Alice","Bike");
        v1.displayVehicleDetails();
        updateRegistrationFee(120);
        v1.displayVehicleDetails();
    }
}
