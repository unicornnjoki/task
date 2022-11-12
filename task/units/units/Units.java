
package units;
import java.util.Scanner;

public class Units {
// variable declaration
    int num1,num2,num3;
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter java marks");
    num1=input.nextInt();
    System.out.println("Enter networking marks");
    num2=input.nextInt();
    System.out.println("Enter math marks");
    num3=input.nextInt();
    
    System.out.println("average:"+(num1+num2+num3)/3);
    }
    
}
