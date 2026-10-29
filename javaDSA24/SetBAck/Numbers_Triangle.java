package SetBAck;
import java.util.Scanner;
public class Numbers_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number:-->");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int h = 1; h <= 2 * i - 1; h++) {
                System.out.print(num+" ");
              if(h < i){
                  num++;
              }
              else{//jab num max value ya index value to cross karjayega
                  num--;
              }
            }
            System.out.println();
        }
        sc.close();
    }
}
