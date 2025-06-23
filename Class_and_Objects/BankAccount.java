public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    public BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void Deposit(double money){
        this.balance=this.balance+money;
        System.out.println("Your Account has a Deposit of : "+money + " Current balance is : "+this.balance);
    }
    public void Withdraw(double money){
        double total=this.balance;
        if(total<money){
            System.out.println("Not sufficient balance");
        }else{
            this.balance=this.balance-money;
            System.out.println("Withdraw of "+ money +" Successfull current balance is : "+this.balance);
        }
    }
    public void currentBalance(){
        System.out.println("Current Balance is : "+this.balance);
    }
    public static void main(String... args){
        BankAccount b1=new BankAccount("Alice",123,100);
        b1.currentBalance();
        b1.Deposit(20);
        b1.Withdraw(80.5);
        b1.currentBalance();
    }
}
