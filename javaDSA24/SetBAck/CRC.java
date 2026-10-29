package SetBAck;
import java.util.Scanner;

public class CRC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data bits
        System.out.print("Enter data bits: ");
        String data = sc.next();

        // Input generator bits
        System.out.print("Enter generator bits: ");
        String generator = sc.next();

        int dataLen = data.length();
        int genLen = generator.length();

        // Append zeros to data (length = generator length - 1)
        StringBuilder appendedData = new StringBuilder(data);
        for (int i = 0; i < genLen - 1; i++) {
            appendedData.append('0');
        }

        // Find remainder (CRC)
        String remainder = divide(appendedData.toString(), generator);

        // Form codeword (data + remainder)
        String codeword = data + remainder;
        System.out.println("Transmitted Codeword: " + codeword);

        // Receiver side
        System.out.print("Enter received codeword: ");
        String received = sc.next();

        String recvRemainder = divide(received, generator);

        if (recvRemainder.contains("1")) {
            System.out.println("Error detected in received codeword!");
        } else {
            System.out.println("No error in received codeword.");
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
