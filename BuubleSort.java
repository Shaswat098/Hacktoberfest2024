import java.sql.SQLOutput;
import java.util.Arrays;

public class BuubleSort {
    public static void main(String[] args) {
        int arr[] = {1,-3,5,-6,0,8};
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
                for (int j =  1; j <= arr.length - i - 1; j++) {
                    if (arr[j-1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped=true;
                    }
                }
                if(!swapped){
                    break;
                }
            }
        /*for(int k=0;k<arr.length-1;k++){
            System.out.println(arr[k]+" ");*/
        System.out.println(Arrays.toString(arr));
        }
    }


