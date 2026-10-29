package AWT;
class vehicle{
    String Brand;
    String Model;
    public vehicle(String Brand ,String Model){
        this.Brand=Brand;
        this.Model=Model;
    }
    void display(){
        System.out.println("Brand : "+this.Brand);
        System.out.println("Model : "+this.Model);
    }
}
class Car extends vehicle{
    int speed;
    int yrs;
    Car(int speed,int yrs){
        super("G wagon-R","Mast Model");
        this.speed=speed;
        this.yrs=yrs;
    }
    void display(){
        super.display();
        System.out.println("Speed : "+this.speed);
        System.out.println("yrs : "+this.yrs);
    }
}
public class Supra {
    public static void main(String[] args) {
        Car gaddi = new Car(30,40);
        gaddi.display();
    }
}
