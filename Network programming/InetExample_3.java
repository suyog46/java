import java.net.*;
public class InetExample_3 {
    public static void main(String[] args) throws Exception{
        InetAddress address=InetAddress.getByName("https://www.youtube.com/watch?v=AX-TXNpTqHY&t=323s");
        System.out.println(address.getHostName());
        InetAddress add=InetAddress.getLocalHost();
        System.out.println(add.getHostName());
        System.out.println(add.getHostAddress());
    }
}
