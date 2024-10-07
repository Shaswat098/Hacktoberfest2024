import java.util.Arrays;

public class CyclicSort {
    public static void main(String[]args){
        int arr[]={2,4,1,3,5};
        int i=0;
        while(i<arr.length){
            int findex=arr[i]-1;
            if(arr[i]!=i+1) {
                if (arr[i] != arr[findex]) {
                    swap(arr, i, findex);
                }
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
