package DataStructuresAndAlgorithmsDeepDiveUsingJava;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,4,7,67,43,8,3,-546,342,-5,0};
        for (int u=1;u< arr.length;u++){
            int e = arr[u];
            int j;
            for (j=u;j>0 && arr[j-1]>e;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = e;
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
