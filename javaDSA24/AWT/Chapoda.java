package AWT;
import java.io.*;
public class Chapoda {
    public static void main(String[] args) {
        try {
            String Filename = "details.txt";

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(Filename));
            String details = "Saud ek Panba H";
            byte[] data = details.getBytes();
            bos.write(data);
            bos.flush();
            bos.close();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Filename));
            int bytedata;
            while ((bytedata = bis.read()) != -1) {
                System.out.print((char) bytedata);
            }
            bis.close();
        }
    catch(IOException e){
        System.out.println("Invalid Input");
    }
    }

}
