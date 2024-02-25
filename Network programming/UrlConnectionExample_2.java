import java.io.InputStream;
import java.net.*;
public class UrlConnectionExample_2 {
    public static void main(String[] args) throws Exception {
        URL url=new URL("https://www.google.com/");
        URLConnection ucl=url.openConnection();
        InputStream ips=ucl.getInputStream();
        int data;
        while((data=ips.read())!=-1){
            System.out.println((char)data);
        }
        
    }
}
