

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ContiniousClient{
    public static void main(String[] args){
        try {
            Socket sc = new Socket("localhost", 12345);
            
            OutputStream os = sc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            InputStream is=sc.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            
            String str;
            Scanner s=new Scanner(System.in);
            while (true) {
                System.out.println("say something to the server");
                String str1=s.nextLine();
                dos.writeUTF(str1);
                str=dis.readUTF();
                if (str=="bye") {
                    System.out.println("Exiting.....");
                    break;
                }
            }
     s.close();
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
