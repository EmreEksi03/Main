package Okul.calisma.video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class howSum {
    public static void main(String[] args) {
        Map<Integer,ArrayList> mp = new HashMap<>();
        System.out.println(calculate(12,new int[] {6,4,8},mp));
    }
    public static ArrayList calculate(int n,int[] arr,Map<Integer,ArrayList> mp){
        if (mp.containsKey(n)){
            return mp.get(n);
        }
        if (n==0){
            return new ArrayList() {};
        }
        if (n<0){
            return null;
        }
        for (int i=0;i<arr.length;i++){
            int remainder = n-arr[i];
            ArrayList remainderResult = calculate(remainder,arr,mp);
            if (remainderResult!=null){
                remainderResult.add(arr[i]);
                //ArrayList temp = remainderResult;
                //remainderResult.remove(remainderResult.size()-1);
                mp.put(n,remainderResult);
                return mp.get(n);
            }
        }
        mp.put(n,null);
        return null;
    }
}