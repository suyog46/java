
import java.io.*;
import java.net.*;

public class MyServer_1 {
    public static void main(String[] args) {
        try {
           
            ServerSocket ss = new ServerSocket(12345);
            
          
            Socket clientSocket = ss.accept();
            System.out.println("Client connected");
            
            // Create an input stream
            InputStream is = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
            // Read data and display
            int n1 = dis.readInt();
            int n2=n1*n1;

            //create an output stream
                OutputStream os = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeInt(n2);
            
            // Close connection
            dis.close();
            is.close();
            clientSocket.close();
            ss.close();
            dos.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
