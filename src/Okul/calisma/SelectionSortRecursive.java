package Okul.calisma;

public class SelectionSortRecursive {

    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
        }
        selectionSort(0,array);
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void selectionSort(int idx, int[] arr){
        int minNumber = arr[idx];
        for (int i=idx;i<arr.length;i++){
            if (arr[i]<minNumber){
                arr[idx]=arr[i];
                arr[i]=minNumber;
                minNumber=arr[idx];
            }
        }
        idx++;
        if (idx < arr.length)
            selectionSort(idx,arr);

    }
}
