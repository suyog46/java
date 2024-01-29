package Zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Student.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);
        // Creating a ZipOutputStream to write entries to the ZIP file
        ZipEntry ze = new ZipEntry("example.txt");
        // Creating a ZipEntry for the file within the ZIP file
        zos.putNextEntry(ze);
        // Adding the ZipEntry to the ZipOutputStream
        FileInputStream fis = new FileInputStream("example.txt");
        int data;
        while ((data = fis.read()) != -1) {
            zos.write(data);
        }

        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
