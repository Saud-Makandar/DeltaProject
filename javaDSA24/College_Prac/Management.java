package College_Prac;
class Employee{
    int entry=10000;
    public void CalculateSalary(){
        System.out.println("The entry - level pay is "+entry+" rupees");
    }
    public void CalculateSalary(int basic){
        System.out.println("The entry - level pay with basic add ons is "+(entry+basic)+" rupees");
    }
    public void CalculateSalary(int basic,int bonus){
        System.out.println("The entry - level pay with basic and bonus add ons is "+(entry+basic+bonus)+" rupees");
    }
}
class manager extends Employee{
    int  allowacne;
    public manager(int  allowacne){
        this. allowacne=allowacne;
    }
    public void CalculateSalary(){
        System.out.println("The entry - level pay is "+allowacne+" rupees");
    }
    public void CalculateSalary(int basic){
        System.out.println("The entry - level pay with basic add ons is "+(allowacne+basic)+" rupees");
    }
    public void CalculateSalary(int basic,int bonus){
        System.out.println("The entry - level pay with basic and bonus add ons is "+(allowacne+basic+bonus)+" rupees");
    }
}
public class Management {
    public static void main(String[] args) {
        manager manage = new manager(10000);
        manage.CalculateSalary();;
        manage.CalculateSalary(50000);
        manage.CalculateSalary(50000,20000);
    }
}
