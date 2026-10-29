package Practice.Java;
class MyThreads1 implements Runnable{
    int temp;
    MyThreads1(int temp){
        this.temp=temp;
    }
    public void run(){
        System.out.println("The temperature of the arewa is "+this.temp);
    }
}
class MyThreads2 implements Runnable{
    int humid;
    MyThreads2(int humid){
        this.humid=humid;
    }
    public void run(){
        System.out.println("The temperature of the arewa is "+this.humid);
    }
}
class MyThreads3 implements Runnable{
    int temp;
    int humid;
    public void run(){
        System.out.println("The weather of the given region is  "+(this.temp+this.humid));
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThreads1 t1 = new MyThreads1(100);
        Thread gun1 = new Thread(t1);
        MyThreads2 t2 = new MyThreads2(70);
        Thread gun2 = new Thread(t2);
        MyThreads3 t3 = new MyThreads3();
        Thread gun3 = new Thread(t3);
        gun1.start();
        gun2.start();
        gun3.start();
    }
}
