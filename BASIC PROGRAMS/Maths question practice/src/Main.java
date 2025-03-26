import java.util.*;

 class vijval{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER X : ");
         int a = sc.nextInt();
         System.out.println("ENTER P(X) : ");
         float b = sc.nextFloat();
         System.out.println("ENTER X : ");
         int c = sc.nextInt();
         System.out.println("ENTER P(X) : ");
         float d = sc.nextFloat();

         System.out.println("ENTER X : ");
         int e = sc.nextInt();
         System.out.println("ENTER P(X) : ");
         float f = sc.nextFloat();
         System.out.println("ENTER X : ");
         int g = sc.nextInt();
         System.out.println("ENTER P(X) : ");
         float h = sc.nextFloat();

         System.out.println("ENTER X : ");
         int i = sc.nextInt();
         System.out.println("ENTER P(X) : ");
         float j = sc.nextFloat();
         System.out.println("ENTER X : ");
         int k = sc.nextInt();
         System.out.println("ENTER P(X) : ");
         float l = sc.nextFloat();

         float z = ((a*b)+(c*d)+(e*f)+(g*h)+(i*j)+(k*l));
         float y = (800*z+50);
         System.out.println("EXPECTED INCOME FOR FIVE DAYS IS : ");
         float x = y*5;
         System.out.println(x);


}
}








