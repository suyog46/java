
import java.net.*;
public class UrlExample_1 {

    public static void main(String[] args)  throws Exception{
        URL url=new URL("https://www.youtube.com/watch?v=AX-TXNpTqHY&t=323s");
        System.out.println("Protocol"+url.getProtocol());
        System.out.println("Host name"+url.getHost());
        System.out.println("path"+url.getPath());
        System.out.println("port number"+url.getPort());
        System.out.println("Query"+url.getQuery());
    }
}