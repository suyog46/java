package Serializable_deSerializable;

import java.io.*;

 class Student implements Serializable {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name is: " + name);
        System.out.println("Roll number is: " + roll);
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        // Serialization
        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos); //The ObjectOutputStream acts as a wrapper or decorator around the underlying output stream.
        Student s = new Student("suyog", 46);
        oos.writeObject(s);// allows to write entire Java objects to the underlying output stream.
       //  these methods handle the serialization of the object into a stream of bytes.
        oos.close();
        fos.close();
        System.out.println("Serialization complete");

        // Deserialization
        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student std = (Student) ois.readObject();// Reads the Student object from the file and casts it to Student.
        std.display(); 
        fis.close();
        ois.close();
    }
}
