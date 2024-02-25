

import java.io.*;
import java.net.*;

public class StringServer {
    public static void main(String[] args) {
        try {
           
            ServerSocket ss = new ServerSocket(12345);
            
          
            Socket clientSocket = ss.accept();
            System.out.println("Client connected");
            
            InputStream is = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
                OutputStream os = clientSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            String str1 = dis.readUTF();
            char[] str2=str1.toCharArray();
            int len=str1.length();
            int flag=0;
            for(int i=0;i<len/2;i++){
                if(str2[i]!=str2[len-1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                dos.writeUTF("Palindrome");
    }
    else{
        dos.writeUTF("Not palindrome");
    }
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
