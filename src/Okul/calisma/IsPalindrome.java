package Okul.calisma;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("warts n straw"));
    }
    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i=str.length()-1;i>=0;i--){
            reversed = reversed + str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
}
