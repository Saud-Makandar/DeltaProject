class TrafficLight implements Runnable {
    private String direction;

    public TrafficLight(String direction) {
        this.direction = direction;
    }

    public void run() {
        try {
            System.out.println(direction + " light is glowing GREEN");
            Thread.sleep(1000); // 1 second delay
            System.out.println(direction + " light is glowing YELLOW");
            Thread.sleep(500);  // 0.5 second delay
            System.out.println(direction + " light is glowing RED");
        } catch (InterruptedException e) {
            System.out.println(direction + " light interrupted");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Thread north = new Thread(new TrafficLight("North"));
        Thread east = new Thread(new TrafficLight("East"));
        Thread south = new Thread(new TrafficLight("South"));

        north.start();
        east.start();
        south.start();
    }
}