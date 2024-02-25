import java.io.*;
import java.net.*;
public class ContiniousServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket();
        Socket cs=ss.accept();
        InputStream is=cs.getInputStream();
        DataInputStream dis= new DataInputStream(is);
        OutputStream os= cs.getOutputStream();
        DataOutputStream dos= new DataOutputStream(os);
String str;
        while (true) {
            str=dis.readUTF();

            if (str=="bye") {
                dos.writeUTF("exit");
                break;
            }
            System.out.println("message from client"+str);
        }
        dis.close();
        is.close();
        cs.close();
        ss.close();
        dos.close();
        os.close();
    }
}