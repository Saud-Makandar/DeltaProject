package AWT;
abstract class Emp{
    abstract void Calpay();
}
class FE extends Emp{
    String name ;
    String pay;
    FE(String name,String pay){
        this.name=name;
        this.pay=pay;
    }

    @Override
    void Calpay() {
        System.out.println(this.name+" is a Full time Emplyoee with a montly PAckage of "+this.pay);
    }
}
class PartEm extends Emp {
    String name;
    int pay;

    PartEm(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    @Override
    void Calpay() {
        System.out.println(this.name+" is a Full time Emplyoee with a montly PAckage of "+this.pay*1000+" K");
    }
}
public class Paisa {
    public static void main(String[] args) {
        FE obj = new FE("Sujit ","50K");
        PartEm obj2 = new PartEm("Saud",1000);
        obj.Calpay();
        obj2.Calpay();
    }
}
