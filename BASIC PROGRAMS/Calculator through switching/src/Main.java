import java.util.*;

class vijval{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        int op = sc.nextInt();

        switch (op){
            case 1 : int c = (int)(a+b);
                System.out.println(c);
                break;
            case 2 : int d = (int)(a-b);
                System.out.println(d);
                break;
            case 3 : int e = (int)(a*b);
                System.out.println(e);
                break;
            case 4 : int f =  (int)(a/b);
                System.out.println(f);
                break;
            case 5 : int g = (int)(a%b);
                System.out.println(g);
                break;
            default:
                System.out.println("Press a valid button");




        }
    }
}