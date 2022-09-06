package Okul.calisma;

import java.util.ArrayList;
import java.util.List;

public class Cumulative {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i=0;i< 10;i++){
            array.add((int) (Math.random()*5));
        }
        for (int i=0;i< array.size();i++){
            System.out.print(method2(method(array,0,i),1,0) + " ");
        }

    }
    public static List<Integer> method(List<Integer> arr,int start,int end){

        return arr.subList(start,end);
    }
    public static int method2(List<Integer> arr,int output,int i){
        if (i< arr.size()) {
            output *= arr.get(i);
            return method2(arr,output,++i);
        }
        return output;
    }
}
