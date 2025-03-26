import java.util.*;
import java.util.Random;

public class ROCK_PAPER_SCISSOR{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER \n1 FOR PAPER \n2 FOR SCISSORS\n3 FOR ROCK");
        n=sc.nextInt();
        Random rand = new Random();
        int x = rand.nextInt(1,4);
        if (n==1&&x==3){
            System.out.print("\nYOUR CHOICE : PAPER");
            System.out.println("\nCOMPUTER CHOICE : ROCK\n");
            System.out.println("\nYOU WON !!");
        }
        else if (n==2&&x==1){
            System.out.print("\nYOUR CHOICE : SCISSOR");
            System.out.println("\nCOMPUTER CHOICE : PAPER\n");
            System.out.println("\nYOU WON !!");
        }
        else if (n==3&&x==2){
            System.out.print("\nYOUR CHOICE : ROCK");
            System.out.println("\nCOMPUTER CHOICE : SCISSOR\n");
            System.out.println("\nYOU WON !!");
        }
        else if (n==1&&x==2){
            System.out.print("\nYOUR CHOICE : PAPER");
            System.out.println("\nCOMPUTER CHOICE : SCISSOR\n");
            System.out.println("\nCOMPUTER WON !!");
        }
        else if (n==2&&x==3){
            System.out.print("\nYOUR CHOICE : SCISSOR");
            System.out.println("\nCOMPUTER CHOICE : ROCK\n");
            System.out.println("\nCOMPUTER WON !!");
        }
        else if (n==3&&x==1){
            System.out.print("\nYOUR CHOICE : ROCK");
            System.out.println("\nCOMPUTER CHOICE : PAPER\n");
            System.out.println("\nCOMPUTER WON !!");
        }
        else if (n==1&&x==1){
            System.out.print("\nYOUR CHOICE : PAPER");
            System.out.println("\nCOMPUTER CHOICE : PAPER\n");
            System.out.println("\nGAME TIED !!");
        }
        else if (n==2&&x==2){
            System.out.print("\nYOUR CHOICE : SCISSOR");
            System.out.println("\nCOMPUTER CHOICE : SCISSOR\n");
            System.out.println("\nGAME TIED !!");
        }
        else if (n==3&&x==3){
            System.out.print("\nYOUR CHOICE : ROCK");
            System.out.println("\nCOMPUTER CHOICE : ROCK\n");
            System.out.println("\nGAME TIED !!");
        }
        else {
            System.out.println("\nENTER VALID CHOICE !!!!!!");
        }

    }
}
