import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServever {
    public static void main(String[] args) throws Exception {
        DatagramSocket serversocket= new DatagramSocket(12345);
        byte[] arr= new byte[1024];
        DatagramPacket recievedata=new DatagramPacket(arr, 1024);
        serversocket.receive(recievedata);
        String str= new String(recievedata.getData(),0,recievedata.getLength()) ;
        System.out.println("The data from the client"+str);
        serversocket.close();        
    }
}
