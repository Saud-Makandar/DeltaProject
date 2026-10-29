package AWT;
class BankAcc{
    String acc;
    int Bal;
    String name;
    public BankAcc(){
        this.acc="Saving";
        this.Bal=0;
        System.out.println("Default Constructer is called");
        System.out.println("Acc Type -> "+this.acc);
        System.out.println("Balance : "+this.Bal );
    }
    public  BankAcc(String acc){
        this();
        this.acc=acc;
        System.out.println("Acc Type -> "+this.acc);
        System.out.println("Balance : "+this.Bal );
    }
    public BankAcc(String acc,int Bal){
        this(acc);
        this.Bal=Bal;
        this.acc=acc;
        System.out.println("Acc Type -> "+this.acc);
        System.out.println("Balance : "+this.Bal );
    }
    public BankAcc(String acc,int Bal,String name){
        this(acc,Bal);
        this.Bal=Bal;
        this.acc=acc;
        this.name =name;
        System.out.println("Acc Type -> "+this.acc);
        System.out.println("Balance : "+this.Bal );
        System.out.println("Account holder name : "+this.name);
    }

}
public class Exp1 {
    public static void main(String[] args) {
        BankAcc MotaBhai = new BankAcc("Saving",10000,"Sujit");
    }
}
