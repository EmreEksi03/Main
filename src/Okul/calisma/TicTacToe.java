package Okul.calisma;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private int turn = 1;
    private int[][] board = {{0,0,0},{0,0,0},{0,0,0}};
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.display(ticTacToe.board);
        System.out.println();
        while (ticTacToe.gameOver(ticTacToe.board)==0){
            if (ticTacToe.turn % 2 != 0){
                ticTacToe.makeAmoveX(ticTacToe.board);
                ticTacToe.display(ticTacToe.board);
                System.out.println();
                ticTacToe.turn++;
            }
            else {
                ticTacToe.makeAmoveO(ticTacToe.board);
                ticTacToe.display(ticTacToe.board);
                System.out.println();
                ticTacToe.turn++;
            }
        }
        if (ticTacToe.gameOver(ticTacToe.board)==1){
            System.out.println("X won!!");
            System.out.println();
            System.out.println();
        }
        if (ticTacToe.gameOver(ticTacToe.board)==2){
            System.out.println("O won!!");
            System.out.println();
        }
        if (ticTacToe.gameOver(ticTacToe.board)==3){
            System.out.println("Tie!! No one won!!");
            System.out.println();
        }
        System.out.print("Amount of turns taken: " + (ticTacToe.turn-1));
    }
    public void display(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==0){
                    System.out.print("- ");
                }
                if (arr[i][j]==1){
                    System.out.print("X ");
                }
                if (arr[i][j]==2){
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
    public void makeAmoveX(int[][] arr){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the x and y coordinates of X: ");
        int xCoordinate = keyboard.nextInt();
        int yCoordinate = keyboard.nextInt();
        if (xCoordinate>=3 || xCoordinate<=-1){
            System.out.println("Those coordinates are out of range!!");
            makeAmoveX(arr);
        }
        else if (arr[yCoordinate][xCoordinate] == 0){
            arr[yCoordinate][xCoordinate]=1;
        }
        else {
            System.out.println("That position is filled!!");
            makeAmoveX(arr);
        }
    }
    public void makeAmoveO(int[][] arr){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the x and y coordinates of O: ");
        int xCoordinate = keyboard.nextInt();
        int yCoordinate = keyboard.nextInt();
        if (yCoordinate>=3 || yCoordinate<=-1){
            System.out.println("Those coordinates are out of range!!");
            makeAmoveX(arr);
        }
        if (arr[yCoordinate][xCoordinate] == 0){
            arr[yCoordinate][xCoordinate]=2;
        }
        else {
            System.out.println("That position is filled!!");
            makeAmoveO(arr);
        }
    }

    public int gameOver(int[][] arr){
        int output = 0;
        for (int i=0;i<arr.length;i++) {
            if (Arrays.equals(arr[i],new int[]{1, 1, 1})) {
                output = 1;
                return output;
            }
        }
        for (int i=0;i<arr.length;i++) {
            if (Arrays.equals(arr[i],new int[]{2, 2, 2})) {
                output = 2;
                return output;
            }
        }
        for (int i=0;i<arr.length;i++) {
            int[] temp = new int[3];
            for (int j=0;j<arr[i].length;j++) {
                temp[j] = arr[j][i];
            }
            if (Arrays.equals(temp,new int[]{1, 1, 1})){
                output = 1;
                return output;
            }
        }
        for (int i=0;i<arr.length;i++) {
            int[] temp = new int[3];
            for (int j=0;j<arr[i].length;j++) {
                temp[j] = arr[j][i];
            }
            if (Arrays.equals(temp,new int[]{2, 2, 2})){
                output = 2;
                return output;
            }
        }
        if (Arrays.equals(new int[] {arr[0][0],arr[1][1],arr[2][2]} , new int[] {1, 1, 1})) {
            output = 1;
            return output;
        }
        else if (Arrays.equals(new int[] {arr[0][0],arr[1][1],arr[2][2]} , new int[] {2, 2, 2})) {
            output = 2;
            return output;
        }
        boolean noMoveToMake = true;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                if (arr[i][j] == 0){
                    noMoveToMake = false;
                }
            }
        }
        if (noMoveToMake){
            output = 3;
            return output;
        }
        return output;
    }

}
