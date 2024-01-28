import java.util.*;

//  custom exception class
class SuyogException extends Exception {
    public SuyogException(String str) {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        try {
            if (num < 20) {
                throw new SuyogException("My custom exception"); 
            } else {
                System.out.println("Good job");
            }
        } catch (SuyogException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
         finally {//this block is optional
            sc.close();
        }
    }
}
