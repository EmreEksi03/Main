package Okul.calisma.video;

import java.util.HashMap;
import java.util.Map;

public class gridTraveler {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        System.out.println(calculate(1,1,mp));
        System.out.println(calculate(2,3,mp));
        System.out.println(calculate(3,3,mp));
        System.out.println(calculate(10,10,mp));
    }
    public static int calculate(Integer m, Integer n,Map<String,Integer> mp){
        String key = m + "," + n;
        if (mp.containsKey(key)){
            return mp.get(key);
        }
        else if (m==1 && n==1){
            return 1;
        }
        else if (m==0 || n==0){
            return 0;
        }
        else {
            mp.put(key,calculate(m-1,n,mp) + calculate(m,n-1,mp));
        }
        return mp.get(key);
    }
}
