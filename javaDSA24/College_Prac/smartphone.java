package College_Prac;
class phone{
    public void call(){
        System.out.println("Basic phone is calling");
    }
    public void call(String number){
        System.out.println("Phjone is Dail in in no : "+number);
    }
    public void call(String number,int duration){
        System.out.println("Phjone is Dail in in no : "+number+" for duration"+duration);
    }

}
class chaluophone extends phone{
    public void call(){
        System.out.println("Chalu phone is calling");
    }
    public void call(String number){
        System.out.println("Chalu phone is Dail in in no : "+number);
    }
    public void call(String number,int duration){
        System.out.println("Chalu phone is Dail in in no : "+number+" for duration"+duration);
    }
}
public class smartphone {
    public static void main(String[] args) {
        chaluophone c = new chaluophone();
        c.call();
        c.call("xxxx");
        c.call("xxx",6);
    }
}
