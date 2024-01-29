import java.lang.reflect.*;

class Student {
    private int roll;
    private String name;

    Student() {
    }

    public Student(String name, int roll) {
    }

    public void display() {
        System.out.println("Display");
    }
}

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c = Class.forName("Student"); 
        
        // Displaying Constructors
        Constructor<?>[] cons = c.getDeclaredConstructors();
        // Retrieves an array of Constructor objects representing all declared constructors of the Student class.
        System.out.println("Constructors of Student:");
        for (Constructor<?> constructor : cons) {
            //agadi ko : vanda agadi chai loop variable ko declaration. Paxadi ko : paxi chai name of array
        System.out.println(constructor); //for Constructor<?> type ko Constructor of object cons
        }

        // Displaying Fields
        Field[] fld = c.getDeclaredFields();
        System.out.println("\nFields of Student:");
        for (Field field : fld) {
            System.out.println(field);
        }

        // Displaying Methods
        Method[] mth = c.getDeclaredMethods();
        System.out.println("\nMethods of Student:");
        for (Method method : mth) {
            System.out.println(method);
        }
    }
}
