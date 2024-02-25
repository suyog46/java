import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread {
    Socket clientSocket;

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            InputStream is = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            OutputStream os = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            // Read data from the client and send response
            int num = dis.readInt();
            dos.writeInt(num * num);

            // Close streams and socket
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

        while (true) {
            Socket clientSocket = ss.accept();
            System.out.println("Client connected from: " + clientSocket.getInetAddress());

            // Start a new thread to handle the client
            ServerThread st = new ServerThread(clientSocket);
            st.start();
        }
    }
}
