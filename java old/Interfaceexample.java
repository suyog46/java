interface Area {
    public abstract void findArea();
}
interface Perimeter{
    public abstract void findPerimeter();
}
class Rectangle implements Area,Perimeter{
    float breadth;
    float length;
public Rectangle(float breadth,float length){
    this.breadth=breadth;
    this.length=length;
}
}
public void findArea(){
    System.out.println("Area is"+length*breadth);
}
public void findPerimeter(){
    System.out.println("perimeter is"+2*(length+breadth));
}

public class Interfaceexample {
    public static void main(String[] args){
        Rectangle r= new Rectangle(20,50);
        r.findArea();
        r.findPerimeter();
}
}