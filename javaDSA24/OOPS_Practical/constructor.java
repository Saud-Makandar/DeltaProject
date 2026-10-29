package OOPS_Practical;
public class constructor {
     public static class car{
         String name;
         int mod;
         String price;
         car(){}
         car(String name, int mod,String price){
            this.name=name;
            this.mod=mod;
            this.price = price;
         }
         car(String x, int y)
         {
             name=x;
             mod=y;
         }
void print(){
    System.out.println(name+" "+mod+" "+price+" ");
         }
     }

    public static void main(String[] args) {
         // yaha pe humne constructor over loading kia h
        car c1 = new car();// agar hum sirf parameterised constructor banate to aisa oibject nhi bana sakte the
        //car(){} woh to hum ne yeh bhi define kiya tha isisliye and concept is known as constructor overloading
        c1.name="Lamborgini";
        c1.mod=2025;
        c1.price="1cr";
        c1.print();
        car c2 = new car("Rolls Royce",2050,"50Cr");
        c2.print();// iski printing mein null 0 null aya!(use keyword This)
        car c3 = new car("G wagon R",2025);
        c3.print();
     }
}
