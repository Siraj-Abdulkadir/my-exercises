import java.util.Scanner;

public class Area_of_Rectangle{
    public static void main(String[] args){
        
        Scanner may10Scanner=new Scanner(System.in);
    
        System.out.println("Enter the width of the rectangle: ");
        int width = may10Scanner.nextInt();
        
        System.out.println("Enter the height of the rectangle: ");
        int height = may10Scanner.nextInt();


        int AreaRectangle = width*height;
        System.out.println("Area of the rectanle is:" + AreaRectangle);
    }
}
