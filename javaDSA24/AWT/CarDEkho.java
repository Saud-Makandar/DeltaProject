package AWT;
abstract class Rental{
    String name;
    String price;
    Rental(String name,String price){
        this.name=name;
        this.price=price;
    }
    abstract void display();
}
class Caar extends Rental{
    Caar(){
        super("G wagon. ","2k");
    }
    public void display(){
        System.out.println("name of the car is "+this.name);
        System.out.println("price of the car is "+this.price);
    }
}
public class CarDEkho {
    public static void main(String[] args) {
        Caar gaddi = new Caar();
        gaddi.display();
    }
}
