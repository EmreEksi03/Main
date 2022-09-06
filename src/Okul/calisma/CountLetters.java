package Okul.calisma;

public class CountLetters {
    public static void main(String[] args) {
        int[] arr = countingLetters("asbhdbksubsadf");
        for (int i=0;i<arr.length;i++){
            System.out.print((char) (i+97) + " " + arr[i] + " ");
        }
    }
    public static int[] countingLetters(String str){
        int [] alphabet = new int[26];
        for (int i=0;i<alphabet.length;i++){
            alphabet[i] = 0;
        }
        for (int i=0;i<str.length();i++){
            alphabet[(int) str.charAt(i) - 97]++;
        }
        return  alphabet;
    }
}
