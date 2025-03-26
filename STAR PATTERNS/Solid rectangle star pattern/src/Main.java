import java.util.*;

class vijval{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS TO BE PRINTED : ");
        int a = sc.nextInt();
        System.out.println("ENTER NUMBER OF COLOUMS TO BE PRINTED : ");
        int b = sc.nextInt();
        for(int i = 1; i<=a; i++ ){
            for (int j = 1; j<=b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}