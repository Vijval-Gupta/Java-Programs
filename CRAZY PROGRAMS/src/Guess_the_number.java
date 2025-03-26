import java.util.*;
import java.util.Random;

class game{
    int noofguess=0;
    int guess;
    int random;
    public game(){
        Random no= new Random();
        int x = no.nextInt(100);
        random=x;
    }
    public void takeuserinput(int n){
        guess = n ;
    }
    public void iscorrect(){
        while(guess!=random){
            noofguess+=1;

            Scanner sc = new Scanner(System.in);
            System.out.print("GUESS A NUMBER : ");
            int z = sc.nextInt();
            takeuserinput(z);

            if (guess<random){
                System.out.println("your guess is smaller ...");
            }
            else if (guess>random){
                System.out.println("your guess is greater ...");
            }
            else{
                System.out.println("YOU GUESSED THE NUMBER CORRECTLY IN "+noofguess+" GUESSES !!!");
                break;
            }

        }

    }


}
public class Guess_the_number {
    public static void main(String[] args) {
        game start = new game();
        start.iscorrect();

    }
}