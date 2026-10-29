package OOPS_Practical;
import java.util.Scanner;
public class Vehicle {
    public static class Car{
        String name;
        int mod;
        int price;
        void print()// class ke ander hi method define
        {
            System.out.println(name+" "+mod+" "+" "+price);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Car c1 = new Car();
        c1.name="Rolls royce";
        c1.mod=911;
        c1.price=10000000;
        c1.print();
        change(c1);
        c1.print();
    }
    static void change(Car c)//hamare object ka method hum yahan dekheinge ki objects are paas by reference
    {
        c.mod=1;
    }
}
