import java.lang.reflect.*;

class MyClass {
    public void display() {
        System.out.println("Sabai aaram ");
    }
}
public class AccessPrivateMethod {
    public static void main(String[] args) throws Exception  {
        Class<?> c = Class.forName("MyClass");
        Method m =c.getDeclaredMethod("display") ;
        m.setAccessible(true);
        Object obj=c.newInstance();
        m.invoke(obj);
    }
}
