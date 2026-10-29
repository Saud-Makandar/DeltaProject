package AWT;
class Temp implements Runnable{
    int temp;
    Temp(int temp){
        this.temp=temp;
    }
    public void run(){
        System.out.println("The temperature of the System is "+this.temp+" Celcius");
    }
}
class Heat implements Runnable{
    int heat;
    Heat(int heat){
        this.heat=heat;
    }
    public void run(){
        System.out.println("The Humidity of the System is "+this.heat+" grams per Kg");
    }
}
class weather implements Runnable{
    int heat;
    int temp;
    weather(int heat,int temp){
        this.heat=heat;
        this.temp=temp;
    }
    public void run(){
        System.out.println("Combined Repot :\n\"The temperature of the System is "+this.temp+" Celcius\n "+
             "The Humidity of the System is "+this.heat+" grams per Kg"   );
    }
}

public class GlobalHeat {
    public static void main(String[] args) {
        Temp T1 = new Temp(100);
        Heat H1 = new Heat(18);
        weather w1 = new weather(100,18);
        Thread ob1 = new Thread(T1);
        Thread ob2 = new Thread(H1);
        Thread ob3 = new Thread(w1);
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
