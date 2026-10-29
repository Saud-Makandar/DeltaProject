import java.io.*;

class Buff {
    public static void main(String[] args) {
        String content = "Name: Saud\nClass: Second-year IT Engineering\nRoll No: 23";

        try {
            // Write content to file using BufferedOutputStream
            BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream("info.txt"));
            outStream.write(content.getBytes());
            outStream.close();

            // Read content from file using BufferedInputStream
            BufferedInputStream inStream = new BufferedInputStream(new FileInputStream("info.txt"));
            int byteData;
            System.out.println("File Content: Saud Makandar");
            while ((byteData = inStream.read()) != -1) {
                System.out.print((char) byteData);
            }
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace(); // Detailed exception info
        }
    }
}