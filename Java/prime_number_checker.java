//MAY 10 /2025
import java.util.Scanner;

public class prime_number_checker {
    public static void main(String[] args){
       Scanner user_input = new Scanner(System.in);

       System.out.println("Please Enter a Number: ");
       int user_number = user_input.nextInt();
       

       if(user_number == 1 || user_number ==2){

        System.out.println("The number recieved is a prime number!!!");
       }
       else{
       for(int x=2; x<user_number; x++){
          if (user_number%x ==0){
            System.out.println("The number recieved is a composite number!!!");
            break;
          }
          if (x == (user_number-1)){
            System.out.println("The number recieved is a prime number!!!");
          }

       }
    }
    }
}
