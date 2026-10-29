
class Mythreads1 extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println("The ticket no "+i+" has been assigend to passenger no "+(10*i+4));
        }
    }
}
class Mythreads2 extends Thread{
    public void run(){
        for(int i=6;i<11;i++){
            System.out.println("The ticket no "+i+" has been assigend to passenger no "+(10*i+4));
        }
    }
}
public class bookingtickets {
    public static void main(String[] args) {
        Mythreads1 t1 = new Mythreads1();
        Mythreads2 t2 = new Mythreads2();
        t1.start();
        t2.start();
    }
}
