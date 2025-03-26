
import java.util.*;
class pattern{
    static int star(int n){
        for (int i = 1 ; i<=n;i++){
            for (int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println("\n");

        }

        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int x = sc.nextInt();
        star(x);

    }
}