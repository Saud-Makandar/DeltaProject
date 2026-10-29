package College_Prac;
class BankAck{
    int balance;
    String acc;
    String acc_holder;
    BankAck(){
        System.out.println("The account type is Saving account");
        System.out.println("The initial Balance of the account is "+this.balance);
    }
    BankAck(String acc){
        this();
        this.acc=acc;
        System.out.println("The account type "+this.acc);
        System.out.println("The initial Balance of the account is "+this.balance);
    }
    BankAck(String acc,int balance){
        this(acc);
        this.acc=acc;
        this.balance=balance;
        System.out.println("The account type "+this.acc);
        System.out.println("The initial Balance of the account is "+this.balance);
    }
    BankAck(String acc,int balance,String acc_holder){
        this(acc,balance);
        this.acc=acc;
        this.balance=balance;
        this.acc_holder=acc_holder;
        System.out.println("The account type "+this.acc);
        System.out.println("The initial Balance of the account is "+this.balance);
        System.out.println("The account holder is "+acc_holder);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAck account = new BankAck("Current",500000,"Saud");
    }
}
