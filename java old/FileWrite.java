import java.io.*;
import java.util.*;

public class FileWrite {
 public static void main(String[] args) throws Exception{
     Scanner sc= new Scanner(System.in);
     String str;
     try{
         
         FileOutputStream fos=new FileOutputStream("Exam.txt");
         System.out.println("enter some string");
         str=sc.nextLine();
         fos.write (str.getBytes());
         fos.close();

    
FileInputStream fis= new FileInputStream("exam.txt");
int data;
while ( ( data=fis.read())!=-1) {
  
    System.out.println((char)data);

}
    fis.close();

 }
 catch(Exception e) {
        e.getMessage();

    }
}
}
