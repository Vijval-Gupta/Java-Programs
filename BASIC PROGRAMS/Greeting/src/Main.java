//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1)
            System.out.println("Hello");
        else if (a==2)
            System.out.println("Namaste");
        else if (a==3)
            System.out.println("Bonjour");
        else
            System.out.println("Invalid button");
    }
}