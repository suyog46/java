import java.io.*;
import java.util.*;
public class FileInputstream {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str;
        
            System.out.println("Enter your name");
            str=sc.nextLine();
            FileOutputStream fos= new FileOutputStream( "Exam.txt");
                fos.write(str.getBytes()); // Converting the string to an array of bytes using the default encoding
                fos.close();
            FileInputStream fis=new FileInputStream("Exam.txt");
            int data;
            while (( data=fis.read())!=-1) {
                System.out.println((char)data);
            }
            fis.close();
        sc.close();

    }
}
