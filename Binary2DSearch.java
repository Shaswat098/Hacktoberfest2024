//Q1:When the 2D array is sorted both row and column wise
import java.util.Arrays;
public class Binary2DSearch {
    public static void main(String[]args){
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
    public static int[] search(int arr[][],int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(target==arr[r][c]){
                return new int[]{r,c};
            }
            else if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}


