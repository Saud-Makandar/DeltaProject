import java.util.Scanner;
public class Voweels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a String ");
        String Quest = sc.nextLine();
        int i=0;
        int count=0;
        while(i!=Quest.length()){
            if(Quest.charAt(i)=='a'||Quest.charAt(i)=='e'||Quest.charAt(i)=='i'||Quest.charAt(i)=='o'||Quest.charAt(i)=='u') count++;
            else if(Quest.charAt(i)=='A'||Quest.charAt(i)=='E'||Quest.charAt(i)=='I'||Quest.charAt(i)=='O'||Quest.charAt(i)=='U') count++;
            i++;
        }
        System.out.println("No of vowels present in the goiven string is "+count);
    }
}
