import java.util.*;
public class check {
  public boolean check (int a ){
    if( a mod 2==0){
      return true;

    }
    else{
      return false;
    }
  }
public static void main(Strings[] args){
  Scanner sc= New Scanner(System.in);
  check obj=new check();
  System.out.println("enter  a number");
  int num=sc.nextInt();
  if(obj.check(num)){
    System.out.println("the number is even");
  }
  else{
    System.out.println("the nunber is odd");
  }
}
}
