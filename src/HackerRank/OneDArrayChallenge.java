package HackerRank;

import java.util.Scanner;

public class OneDArrayChallenge {

    public static boolean canWin(int location,int leap, int[] game) {
        if (location + leap >= game.length || location  == game.length-1)
        {
            return true;
        }
        if (game[location + leap] == 0)   {
            location += leap;
            if (canWin(location,leap, game))return true;
            if (game[location-1] == 0)
                if (canWin(location-1,leap, game))return true;

        }
        if ( game[location + 1] == 0 ) {
            location++;
            if (canWin(location,leap, game))return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of games: ");
        int q = scan.nextInt();
        while (q-- > 0) {
            System.out.println("Enter board length: ");
            int n = scan.nextInt();
            System.out.println("Enter leap length: ");
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter 0 or 1: ");
                game[i] = scan.nextInt();
            }
            int location = 0;
            System.out.println( (canWin(location,leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
