package DataStructuresAndAlgorithmsDeepDiveUsingJava;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,4,7,67,43,8,3,-546,342,-5,0};
        mergeSort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr,int start,int end){
        if (end-start==1){
            return;
        }
        int middle = (start+end)/2;

        mergeSort(arr,start,middle);
        mergeSort(arr,middle,end);
        merge(arr,start,middle,end);
    }
    public static void merge(int[] arr,int start,int middle,int end){
        if(arr[middle-1]<=arr[middle]){
            return;
        }
        int i = start;
        int j = middle;
        int index = 0;

        int[] arr2 = new int[end-start];
        while (i<middle && j<end){
            if (arr[i] < arr[j]){
                arr2[index++] = arr[i++];
            }
            else if (arr[i] > arr[j]){
                arr2[index++] = arr[j++];
            }
        }
        System.arraycopy(arr,i,arr,start + index,middle-i);
        System.arraycopy(arr2,0,arr,start ,index);
    }
}
