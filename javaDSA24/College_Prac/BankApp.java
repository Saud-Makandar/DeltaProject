package College_Prac;
class MinimumBalanceException extends Exception{
    public MinimumBalanceException(String Message){
        super(Message);
    }
}
class Atm{
    double balance;
    Atm(int balance){
        this.balance=balance;
    }
    public double withdrawal(int amount) throws MinimumBalanceException{
        if(balance-amount<1000) System.out.println("The minimum balance to keep ur account valid in this bank is 1000");
        return balance-=amount;
    }
}
public class BankApp {
    public static void main(String[] args) {
        try {
            Atm account1 = new Atm(19999);
            Atm account2 = new Atm(19999);
           double balance1= account1.withdrawal(19000);
            System.out.println(balance1);
            double balance2= account2.withdrawal(10000);
            System.out.println("Remaining balance in atm  after wthdrawal is "+balance2);

        }
        catch(MinimumBalanceException e){
            System.out.println("error"+ e.getMessage());
        }
    }
}
