import java.sql.SQLOutput;
import java.util.*;

class vijval{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        float a = sc.nextFloat();
        System.out.println("Enter second no");
        float b = sc.nextFloat();
        System.out.println("ENTER 1 TO ADD , 2 TO SUBTRACT , 3 TO MULTIPLY , 4 TO DIVIDE , 5 FOR MODULUS");
        float oper = sc.nextFloat();
        if (oper==1){
            System.out.println("THEN ANSWER IS : ");
            float c = a + b;
            System.out.println(c);
        }
        else if (oper==2){
            float c = a-b;
            System.out.println("THEN ANSWER IS : ");System.out.println(c);
        }
        else if (oper==3){
            float c = a*b;
            System.out.println("THEN ANSWER IS : ");System.out.println(c);
        }
        else if (oper==4){
            float c = a/b;
            System.out.println("THEN ANSWER IS : ");System.out.println(c);
        }
        else if (oper==5){
            float c = a%b;
            System.out.println("THEN ANSWER IS : ");System.out.println(c);
        }
        else{
            System.out.println("PLEASE PRESS A BUTTON FROM 1 TO 5");
        }




    }
}