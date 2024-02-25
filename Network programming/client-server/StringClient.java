
import java.io.*;
import java.net.*;

public class StringClient{
    public static void main(String[] args){
        try {
            Socket sc = new Socket("localhost", 12345);
            
            
            OutputStream os = sc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is=sc.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            
            String str = "madam";
            dos.writeUTF(str);
            String str2=dis.readUTF();
            // Close connection
            System.out.println("the given string is "+str2);
            dos.close();
            os.close();
            sc.close();
            is.close();
            dis.close();
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
