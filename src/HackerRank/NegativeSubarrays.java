package HackerRank;

import java.util.Scanner;

public class NegativeSubarrays {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int n = keyboard.nextInt();
        System.out.println();
        int[] array = new int[n];
        System.out.println("Enter elements of your array: ");
        for (int i=0;i<n;i++){
            array[i] = keyboard.nextInt();
        }
        System.out.println(getSubArrays(array));
    }
    public static int getSubArrays(int[] arr){
        int retVal = 0;
        for (int i=0;i<arr.length;i++){
            int subtotal=0;
            for (int j=i;j<arr.length;j++){
                subtotal+=arr[j];
                if (subtotal<0) {
                    retVal++;
                }
            }
        }
        return retVal;
    }
}