package Okul.calisma.video;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllSum {
    public static void main(String[] args) {

        System.out.println(calculate(24,new int[] {4,12},new HashMap<>()));

        System.out.println(calculate(24,new int[] {4,3,6,8,12},new HashMap<>()));
        System.out.println(calculate(9,new int[] {2,4,6},new HashMap<>()));
    }
    public static List<Integer> calculate (int n,int[] arr,Map<Integer,List<Integer>> mp){

        if (mp.containsKey(n)){
            List<Integer> integers = mp.get(n);
            return new ArrayList<>(integers);
        }
        if (n==0){
            return new ArrayList<>();
        }
        if (n<0){
            return null;
        }
        List<Integer> shortestComb = null;
        for (int i=0;i<arr.length;i++){
            int remainder = n-arr[i];
            List<Integer> remainderResult = calculate(remainder,arr,mp);
            if (remainderResult!=null){
                remainderResult.add(arr[i]);
                if (shortestComb == null || shortestComb.size()> remainderResult.size()){
                    shortestComb = new ArrayList<>(remainderResult);
                }
            }
        }
        if (shortestComb == null)
            return null;
        mp.put(n,shortestComb);
        return new ArrayList<>(shortestComb);
    }
}
