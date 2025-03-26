import java.util.*;
class average{

    static float avg(float ...arr){
        float sum = 0 ;
        int count=0;
        for (float a: arr){
            sum+=a;
            count+=1;
        }
        return sum/count;
    }
    public static void main(String[] args){
        float  z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements - ");
        int x = sc.nextInt();
        float [] a  = new float[x];
        System.out.println("Enter elements ");
        for (int i = 0 ; i<x;i++){
            a[i]=sc.nextFloat();
        }
        System.out.print("Average of given numbers is ");
        float result = avg(a);
        System.out.printf("%.2f",result);


    }
}