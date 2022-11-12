import java.util.Scanner
package triangle_area;


public class Triangle_area {
   
    public static void main(String[] args) {
      
        Scanner s new Scanner(System.in);
        
        System.out,println("enter the width of the triangle:");
        double b=s.nextDouble();
        
        System.out,println("enter the height of the triangle:");
        double h=s.nextDouble();
        
        //Area = (width*height)/2
        double area=(b*h)/2;
        System.out.println("Area of Triangle:"+area);
        
    }
    
}
