package College_Prac;
import java.util.Scanner;
abstract class Paypal{
    abstract void display();
}
class full extends Paypal{
    String name;
    int salary;
    public full(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    void display() {
        System.out.println("NAme of the employee is "+this.name+" and the salary of the meployee is "+this.salary);
    }
}
class Part extends Paypal{
    String name;
    int salary;
    int hour;
    public Part(String name,int salary,int hour){
        this.name=name;
        this.salary=salary;
        this.hour=hour;
        this.salary=this.salary* this.hour;
        }
        @Override
        void display() {
            System.out.println("NAme of the employee is "+this.name+" and the salary of the meployee is "+this.salary);
        }
}
public class Payroll {
    public static void main(String[] args) {
        full f = new full("Summit",9000);
        Part p= new Part("Nemi",90,18);
        f.display();
        p.display();
    }
}
