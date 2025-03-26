import java.util.*;

class vijval{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto which you want even number : ");
        int n = sc.nextInt();
        int i = 0;
        while (i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}