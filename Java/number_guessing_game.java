import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args){
        Random new_number = new Random();
        Scanner user_input = new Scanner(System.in);
    
        int new_gen_num = new_number.nextInt(100);
        int x = 0;
        while(x<3){

            if(x==0){
            System.out.println("Guess a number between 1-100: ");
            }
            int user_n = user_input.nextInt();

            if(user_n == new_gen_num){
                System.out.println("Congratulations You Guessed the number: " + "Random Number Generated: " + new_gen_num);
                break;
            }
            else if (x==2){
                System.out.println("Sorry, Game Over You have used all the chances " + "The Random Number Generated Was: " + new_gen_num);
                user_input.close();
                break;
            }
            else{
                System.out.println("Take another guess: ");
                x++;

            }
        }
        
    }

}
