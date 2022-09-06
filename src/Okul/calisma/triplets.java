package Okul.calisma;

public class triplets {
    public static void main(String[] args) {
        triplets(new int[] {0,7,0,6,77,3,2,4,5,7},7);
    }
    public static void triplets(int[] arr,int a){
        for (int i=0;i< arr.length-2;i++){
            int sum = 0;
            sum+=arr[i];
            for (int j=i+1;j< arr.length-1;j++){
                sum+=arr[j];
                for (int k=j+1;k< arr.length;k++){
                    sum+=arr[k];
                    if (sum==a){
                        System.out.print(arr[i] + " ");
                        System.out.print(arr[j] + " ");
                        System.out.print(arr[k]);
                        System.out.println();
                    }
                    sum-=arr[k];
                }
                sum-=arr[j];
            }
        }
    }
}
