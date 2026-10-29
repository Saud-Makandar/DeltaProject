package SetBAck;
import java.util.Scanner;

public class OPT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data bits
        System.out.print("Enter the number of data bits: ");
        int dataBits = sc.nextInt();
        System.out.print("Enter the data bits: ");
        String data = sc.next();

        // Input generator bits
        System.out.print("Enter the number of generator bits: ");
        int genBits = sc.nextInt();
        System.out.print("Enter the generator bits: ");
        String generator = sc.next();

        int genLen = generator.length();

        // Append zeros to data (length = generator length - 1)
        StringBuilder appendedData = new StringBuilder(data);
        for (int i = 0; i < genLen - 1; i++) {
            appendedData.append('0');
        }
        System.out.println("The Appended data word is: " + appendedData);

        // Find remainder (CRC)
        String remainder = divide(appendedData.toString(), generator);
        System.out.println("The reminder after division of appended data word by generator bits is: " + remainder);

        // Form codeword (data + remainder)
        String codeword = data + remainder;
        System.out.println("Transmitted code word is: " + codeword);

        // Receiver side
        System.out.println("At Receiver side, ");
        System.out.print("Enter the received code word: ");
        String received = sc.next();

        String recvRemainder = divide(received, generator);
        System.out.println("The reminder after dividing received codeword by generator bits is: " + recvRemainder);

        if (recvRemainder.contains("1")) {
            System.out.println("As reminder is non zero, the received code word has errors.");
        } else {
            System.out.println("As reminder is zero, received code word has no errors.");
        }

        sc.close();
    }

    // Function to perform binary division and return remainder
    private static String divide(String dividend, String divisor) {
        char[] data = dividend.toCharArray();
        char[] gen = divisor.toCharArray();
        int genLen = gen.length;

        for (int i = 0; i <= data.length - genLen; i++) {
            if (data[i] == '1') {
                for (int j = 0; j < genLen; j++) {
                    data[i + j] = (data[i + j] == gen[j]) ? '0' : '1';
                }
            }
        }

        // Remainder is the last (genLen-1) bits
        return new String(data).substring(data.length - genLen + 1);
    }
}
