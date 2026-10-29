package AWT;
class Hotel{
    String type= "Standard";
    int price =2000;
    Hotel(){
        System.out.println(" room type : "+type);
        System.out.println("Price : "+price);
    }
    Hotel(String type){
        this.type=type;
        switch(type){
            case "Delux":
                this.price=3500;
                System.out.println(" room type : "+type);
                System.out.println("Price : "+price);
                break;
            case "Standard":
                System.out.println(" room type : "+type);
                System.out.println("Price : "+price);
                break;
            case "Suite":
                this.price=5000;
                System.out.println(" room type : "+type);
                System.out.println("Price : "+price);
                break;
            default:
                System.out.println("Oye Galat room hai");
                break;
        }
    }
    Hotel(Hotel other){
        this.type=other.type;
        this.price=other.price;
        System.out.println(" room type : "+type);
        System.out.println("Price : "+price);
    }
}
public class MakeMyTrip {
    public static void main(String[] args) {
        Hotel ob1 =new Hotel();
        Hotel ob2 =new Hotel("Delux");
        Hotel copie =new Hotel( ob2);

    }
}
