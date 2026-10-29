import java.util.Scanner;


// Step 1: Define user-defined exception for marks validation
class MarksOutOfBoundsException extends Exception {
   public MarksOutOfBoundsException(String message) {
       super(message);
   }
}


// Step 2: Class to hold student details and marks
class Result {
   String name;
   String seatNo;
   String date;
   String centreNo;
   int[] marks; // marks for subjects in sem-2


   // Constructor to initialize details
   public Result(String name, String seatNo, String date, String centreNo, int[] marks) {
       this.name = name;
       this.seatNo = seatNo;
       this.date = date;
       this.centreNo = centreNo;
       this.marks = marks;
   }


   // Step 3: Method to validate marks
   public void validateMarks() throws MarksOutOfBoundsException {
       for (int i = 0; i < marks.length; i++) {
           if (marks[i] < 0 || marks[i] > 100) {
               // Throw exception if invalid mark found
               throw new MarksOutOfBoundsException("Mark for subject " + (i+1) + " is out of bounds: " + marks[i]);
           }
       }
   }


   // Method to display result details
   public void display() {
       System.out.println("\n--- Result ---");
       System.out.println("Name          : " + name);
       System.out.println("Seat No       : " + seatNo);
       System.out.println("Date          : " + date);
       System.out.println("Centre No     : " + centreNo);
       System.out.print("Marks (sem-2) : ");
       for (int m : marks) {
           System.out.print(m + " ");
       }
       System.out.println();
   }
}


// Main class with program logic
public class Prob_23{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       // Input details from user
       System.out.print("Enter Name: ");
       String name = sc.nextLine();


       System.out.print("Enter Seat No: ");
       String seatNo = sc.nextLine();


       System.out.print("Enter Date (DD-MM-YYYY): ");
       String date = sc.nextLine();


       System.out.print("Enter Centre No: ");
       String centreNo = sc.nextLine();


       System.out.print("Enter number of subjects in Sem-2: ");
       int subjectCount = sc.nextInt();


       int[] marks = new int[subjectCount];
       System.out.println("Enter marks for each subject:");


       for (int i = 0; i < subjectCount; i++) {
           System.out.print("Subject " + (i+1) + ": ");
           marks[i] = sc.nextInt();
       }


       // Create Result object
       Result result = new Result(name, seatNo, date, centreNo, marks);


       // Step 4 & 5: Validate marks and handle exception
       try {
           result.validateMarks();
           // If valid, display the result
           result.display();
       } catch (MarksOutOfBoundsException e) {
           System.out.println("Error: " + e.getMessage());
       }


       sc.close();
   }
}
