abstract class shape {
 public void display(){
    System.out.println("I am abstract class");
 }
 public  abstract void  area();
}
class Triangle extends shape{
    float length,breadth;
    public void value(float length,float breadth){
        this.breadth=breadth;
        this.length=length;
    }
    public void area(){
        super.display();
        System.out.println("area of triangle "+(0.5*breadth*length));//area method chai value matra nalina vayera
        //implement garna pani use garnu parxa
        
    }

}



public class Abstraction {
    public static void main(String[] args) {
        Triangle T=new Triangle();
        T.value(5,10);
        T.area();
    }
}
