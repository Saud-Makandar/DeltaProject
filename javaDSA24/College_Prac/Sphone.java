package College_Prac;
class mobile{
    public void calls(){
        System.out.println("Dail in ... ... ...");
    }
}
interface Music_Player{
    void music();
}
interface Camera{
    void photo();
}
public class Sphone extends mobile implements Music_Player,Camera {
    @Override
    public void calls() {
        System.out.println("Dailing from smartphone");
    }

    @Override
    public void music() {
        System.out.println("Music is playing via smartphone");
    }

    @Override
    public void photo() {
        System.out.println("Photo is clicked by by camera");
    }
}
