//a thread is the smallest unit of execution within a process. It represents an independent path of execution within a program. Threads allow concurrent execution of tasks, enabling programs to perform multiple operations simultaneously or to handle tasks concurrently, such as handling multiple client connections in a server application.
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServerThread extends Thread {
    Socket clientSocket;

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() { //thread class ko function lai override gareko 
        try {
            InputStream is = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            // Read data from the client and send response
            int num = dis.readInt();
            dos.writeInt(num * num);

            dis.close();
            dos.close();
            clientSocket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class MultithreadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(12345);
        System.out.println("Server started...");


        //For each client connection, a new instance of ServerThread is created with the client's socket, and a new thread is started to handle that client. This allows the server to handle multiple clients simultaneously.
        while (true) {
            Socket clientSocket = ss.accept();
            System.out.println("Client connected from: " + clientSocket.getInetAddress());

            // Start a new thread to handle the client
            ServerThread st = new ServerThread(clientSocket);
            st.start();
        }
    }
}
