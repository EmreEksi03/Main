package Okul.calisma;

public class Ocurrance {
    public static void main(String[] args) {
        int[]A = {1, 2, 5, 1};
        int a =6;
        System.out.println(countOcr(A,a));
    }
    public static int countOcr(int[] A,int a){
        int output =0;
        for (int i=0;i<A.length;i+=2){
            if (A[i]!=a){
                output++;
            }
        }
        return output;
    }
}
