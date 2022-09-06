package Okul.calisma;
import java.util.Scanner;
public class RandomInt2DArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for (int i=0;i< array.length;i++){
            for (int j=0;j< array[i].length;j++){
                array[i][j] = (int) (Math.random()*100);
            }
        }
        displayArray(array);
    }
    public static void displayArray (int[][] arr){
        for (int rows=0;rows< arr.length;rows++){
            for (int cols=0;cols< arr[rows].length;cols++){
                System.out.print(arr[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
