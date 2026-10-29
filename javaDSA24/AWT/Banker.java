package AWT;
class MinBalance extends Exception{
    public MinBalance(String message){
        super(message);
    }
}
class BackOffc{
    int init_Bal;
    BackOffc(int init_Bal){
        this.init_Bal=init_Bal;

        System.out.println("Balance before withdrawal : "+this.init_Bal);
    }
    void withdraw(int  amount) throws MinBalance{
        if(init_Bal-amount<1000) throw new MinBalance("Pehli fursat se paise daalo warna ");
        else System.out.println("Balance after witthdrawal "+(init_Bal-amount));
    }
}
public class Banker {
    public static void main(String[] args) {

        try{
            BackOffc ob1 = new BackOffc(1500);
            ob1.withdraw(501);
        }catch(MinBalance e){
            System.out.println("Error : "+e.getMessage());
        }

    }
}
