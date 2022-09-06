package DataStructuresAndAlgorithmsDeepDiveUsingJava;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2,4,7,67,43,8,3,-546,342,-5,0};
        shellSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void shellSort(int[] arr){
        for (int gap = arr.length/2;gap>0;gap/=2){

            for(int i=gap;i<arr.length;i++){
                int e = arr[i];
                int j=i;
                while (j>=gap && arr[j-gap]>e){
                    arr[j] = arr[j-gap];
                    j-=gap;
                }
                arr[j] = e;
            }
        }
    }
}
