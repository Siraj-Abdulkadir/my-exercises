//May 10/2025
import java.util.Scanner;

public class celsius_to_fahrenheit {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the value of celsius: ");
        double celsiusValue = userInput.nextDouble();

        double fahrenheitValue = (celsiusValue*1.8) + 32;
        System.out.println(celsiusValue + " Celsius in Fahrenheit is " + fahrenheitValue);
    }
     
}