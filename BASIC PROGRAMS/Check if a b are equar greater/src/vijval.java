import java.util.*;

class vijval{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a==b){
            System.out.println("Both are equal");
        }
        else if (a>b){
            System.out.println("First number is greater");
        }
        else {
            System.out.println("Second number is greater");
        }

    }
}