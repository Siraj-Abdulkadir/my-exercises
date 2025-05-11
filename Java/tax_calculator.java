//MAY 10 /2025
import java.util.Scanner;

public class tax_calculator {
    public static void main(String[] args){
        Scanner user_Input = new Scanner(System.in);
        
        System.out.println("Enter the tax rate(in percent): ");
        double tax_rate = user_Input.nextInt();
        System.out.println("Enter the base salary: ");
        int base_salary = user_Input.nextInt();
     
        double calclulated_salary = base_salary - (base_salary* (tax_rate/100));

        System.out.print("Your final salary after tax of " + tax_rate +"% is " + calclulated_salary);

        user_Input.close();

    }
}
