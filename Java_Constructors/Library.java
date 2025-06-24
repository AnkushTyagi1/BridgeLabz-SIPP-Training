public class Library {
    static class Book{
        String title;
        String author;
        double price;
        int available;

        Book(String title,String author,double price,int available) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = available;
        }
        public void borrow(int num){
            if(this.available>=num){
                System.out.println("Borrow Successfull");
                this.available=this.available-num;
            }else{
                System.out.println("Books are not available");
            }
        }
    }
    public static void main(String[] args){
        Book b1=new Book("Harry Potter","Alice",120.10,10);
        b1.borrow(5);
        b1.borrow(10);
    }
}
