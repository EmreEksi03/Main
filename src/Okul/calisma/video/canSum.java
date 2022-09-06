package Okul.calisma.video;

import java.util.HashMap;
import java.util.Map;

public class canSum {
    public static void main(String[] args) {
        Map<Integer,Boolean> mp = new HashMap<>();
        System.out.println(calculate(7,new int[] {2, 3, 4},mp));
        mp.clear();
        System.out.println(calculate(9,new int[] {2, 4},mp));
        mp.clear();
        System.out.println(calculate(165,new int[] {2, 3, 4, 7},mp));
    }
    public static boolean calculate(int n, int[] k, Map<Integer,Boolean> mp){
        if (mp.containsKey(n)){
            return mp.get(n);
        }
        if (n==0){
            return true;
        }
        if (n<0){
            return false;
        }
        for (int i = 0; i < k.length; i++) {
            int remainder = n - k[i];
            if (calculate(remainder, k, mp)){
                mp.put(n, true);
                return (true);
            }
        }
        mp.put(n,false);
        return false;
    }
}
