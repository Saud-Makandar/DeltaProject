package College_Prac;
class HotelRoom {
    String type;
    int price;

    public HotelRoom() {
        this.type = "Standard";
        this.price = 2000;
    }

    public HotelRoom(String type) {
        this.type = type;
        switch (type) {
            case "Deluxe":
                this.price = 3500;
                break;
            case "Suite":
                this.price = 5000;
                break;
            default:
                this.type = "Standard";
                this.price = 2000;
        }

    }
    public HotelRoom(HotelRoom other) {
        this.type = other.type;
        this.price = other.price;
    }
    public void displayDetails() {
        System.out.println("Room Type: " + type + ", Price: ₹" + price);
    }
}
public class HotelRoomBooking {
    public static void main(String[] args) {
                HotelRoom defaultRoom = new HotelRoom();
                HotelRoom deluxeRoom = new HotelRoom("Deluxe");
                HotelRoom suiteRoom = new HotelRoom("Suite");
                HotelRoom copiedRoom = new HotelRoom(deluxeRoom);

                System.out.println("Default Room:");
                defaultRoom.displayDetails();

                System.out.println("Deluxe Room:");
                deluxeRoom.displayDetails();

                System.out.println("Suite Room:");
                suiteRoom.displayDetails();

                System.out.println("Copied Deluxe Room:");
                copiedRoom.displayDetails();
    }
}


