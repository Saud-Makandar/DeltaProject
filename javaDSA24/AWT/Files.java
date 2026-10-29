package AWT;
import java.io.*;
public class Files {
    public static void main(String[] args) {
        try{
            String Filename="info.txt";
            BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream(Filename));
            String info="Saud and Sumit are best Friends ";
            byte[] data=info.getBytes();
            bos.write(data);
            bos.flush();
            bos.close();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Filename));
            int bytedata;
            while((bytedata=bis.read())!=-1){
                System.out.print((char)bytedata);
            }
            bis.close();
        }catch(IOException e){
            System.out.println("Oye i ki Hoya");
        }
    }
}
