package CharacterInput_Stream;
import java.io.*;
import java.util.*;
public class FileCopy {
        public static void main(String[] args) throws Exception {
            FileReader fr=new FileReader("Exam.txt");
            FileWriter fw=new FileWriter("Copied.txt");
            int data;
            while ((data=fr.read())!=-1) {
                fw.write(data);
            }
        }
}