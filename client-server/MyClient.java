import java.io.*;
import java.net.*;

public class MyClient{
    public static void main(String[] args){
        try {
            // Create a socket to connect to the server on localhost:12345
            Socket sc = new Socket("localhost", 12345);
            
            // Create an output stream
            OutputStream os = sc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            // Write data
            String str = "Hello server";
            dos.writeUTF(str);
            
            // Close connection
            dos.close();
            os.close();
            sc.close();
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
