public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicket() {
        if (movieName != null) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }

    public static void main(String... args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", "B12", 300.0);
        ticket.displayTicket();
    }
}
