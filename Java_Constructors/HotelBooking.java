public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking(){
        this.guestName="UnKnown";
        this.roomType="none";
        this.nights=0;
    }

    public HotelBooking(String name,String type,int nights){
        this.guestName=name;
        this.roomType=type;
        this.nights=nights;
    }

    public HotelBooking(HotelBooking h1){
        this.roomType=h1.roomType;
    }
    public static void main(String[] args){
        HotelBooking h1=new HotelBooking("Alice","Luxury",2);
        HotelBooking h2=new HotelBooking(h1);
        h2.guestName="Bob";
        h2.nights=3;
    }
}
