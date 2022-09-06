package Okul.calisma.video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args){
        Map<Integer,Integer> arr = new HashMap<>();
        arr.put(1,1);
        arr.put(2,1);
        System.out.println(calculate(400,arr));
        System.out.println(calculate(9,arr));
    }

    public static Integer calculate(Integer n,Map<Integer,Integer> arr) {
        if (arr.get(n) != null){
            return arr.get(n);
        }
        else {
            arr.put(n,calculate(n-1,arr)+ calculate(n-2,arr));
        }
        return arr.get(n);
    }
}
