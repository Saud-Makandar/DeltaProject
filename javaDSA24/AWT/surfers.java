package AWT;
import java.io.*;
public class surfers {
    public static void main(String[] args) {
        try {
            String Filename = "Details.txt";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(Filename));
            String Details = "Saud ek Pyaara Baccha H";
            byte[] data = Details.getBytes();
            bos.write(data);
            bos.flush();
            bos.close();
            BufferedInputStream Bis = new BufferedInputStream(new FileInputStream(Filename));
            int bytedata;
            while ((bytedata = Bis.read()) != -1) {
                System.out.print((char) bytedata);
            }
            Bis.close();
        } catch (IOException e) {
            System.out.println("Error Occured " + e.getMessage());
        }
    }
}