package Okul.calisma;

public class Bubblesort {
    public static void main(String[] args) {
        int [] array = new int[7];
        for (int i=0;i< array.length;i++){
            array[i] = (int) (Math.random()*100);
        }
        for (int i=0;i< array.length;i++){
            System.out.print(bubbleSort(array)[i] + " ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        boolean switchTomake = true;
        while (switchTomake) {
            switchTomake = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    switchTomake =true;
                }
            }
        }
        return arr;
    }
}
