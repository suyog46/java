package CharacterInput_Stream;
import java.util.*;
import java.io.*;

public class characterInputStream {
public static void main(String[] args) throws Exception {

  FileWriter fw = new FileWriter("Student.txt");
    fw.write("Hello my friend");
    System.out.println("Data written successfully");
    fw.close();
    FileReader fr=new FileReader("student.txt");
    int data;
    while ((data=fr.read())!=-1) {
        System.out.println((char)data);//typecaste gareko .kina ki ascii code ma hunca
    }
    fr.close();
}
}

