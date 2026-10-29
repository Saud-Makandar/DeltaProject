package College_Prac;
import java.util.*;
public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Vector<String> list = new Vector<>();
        System.out.println("Enter the number of students need to be entered");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of student "+(i+1));

            list.add(sc.nextLine());

        }
        list.remove(2);
        System.out.println(list);
        System.out.println( list.contains("Saud"));
    }
}
