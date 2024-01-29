package Buffered;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        FileWriter fw=  new FileWriter("example.txt");
     BufferedWriter bw = new BufferedWriter(fw);
          bw.write("Hello, BufferedWriter!");
          bw.newLine(); // Writes a platform-dependent line separator
          bw.write("This is a new line.");
  
       FileReader fr= new FileReader("example.txt");
        BufferedReader br = new BufferedReader(fr); 
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
}
}
