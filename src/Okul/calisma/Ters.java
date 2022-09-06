package Okul.calisma;

public class Ters {
    public static void main(String[] args) {
        System.out.println(tersCevir("Bu ne bicim soru boyle."));
    }
    public static String tersCevir(String cumle) {
        for (int i=cumle.length()-1;i>=0;i--){
            if (cumle.charAt(i)==' '){
                System.out.print(cumle.substring(i+1) + " ");
                return tersCevir(cumle.substring(0,i));
            }
        }
        return cumle;
    }
}
