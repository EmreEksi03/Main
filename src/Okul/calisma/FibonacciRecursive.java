package Okul.calisma;

public class FibonacciRecursive {
    public static void main(String[] args){
        System.out.println(fibonacci(6));
    }
    public static int fibonacci(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
