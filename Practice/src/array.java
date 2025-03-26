// check if array sorted or not in ascending order

import java.util.*;
public class array {
    public static void main(String[] args) {

        int[] arr1;
        int flag = 0;

        arr1 = new int[15];
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS IN ARRAY : ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
                System.out.print("ENTER ELEMENT " + (i+1) +" : ");
                arr1[i]= sc.nextInt();
            }
        int large = arr1[0];
        for (int i = 1; i < x; i++) {
            if (arr1[i]>large){
                large=arr1[i];
            }
            else{
                flag = 1;

            }
        }
        if (flag==0){
            System.out.println("ARRAY IS SORTED ");
        }
        else {
            System.out.println("ARRAY IS NOT SORTED ");
        }
        }
    }