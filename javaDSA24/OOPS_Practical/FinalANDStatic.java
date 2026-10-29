package OOPS_Practical;
class Cricketer{
    final String country="India";
    int runs;
    String name;
    double avg;
    static String place;
}
public class FinalANDStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //c1.country="England";Error Cannot assign a value to final variable 'country'
        c1.place="UAE" ;
        System.out.println(c1.place);
    }
}
