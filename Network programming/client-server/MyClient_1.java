
import java.io.*;
import java.net.*;

public class MyClient_1{
    public static void main(String[] args){
        try {
            Socket sc = new Socket("localhost", 12345);
            
            OutputStream os = sc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is=sc.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            
            int n1=5;
            dos.writeInt(n1);
            int n2=dis.readInt();
            // Close connection
            System.out.println("the squared number is "+n2);
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
