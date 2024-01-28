import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) throws Exception {
        try {
            // Create a server socket
            ServerSocket ss = new ServerSocket(12345);
            
            // Create a client socket
            Socket clientSocket = ss.accept();
            System.out.println("Client connected");
            
            // Create an input stream
            InputStream is = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
            // Read data and display
            String str = dis.readUTF();
            System.out.println("Data From client: " + str);
            
            // Close connection
            dis.close();
            is.close();
            clientSocket.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
