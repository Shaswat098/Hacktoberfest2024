import java.util.Arrays;

public class CountSort {
    public static  void sort(int []array){
        if(array==null || array.length<=1){
            return;
        }
        int max=array[0];
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        int[] countArray=new int[max+1];
        for(int num:array){
            countArray[num]++;
        }
        int index=0;
        for(int i=0;i<=max;i++){
            while(countArray[i]>0){
                array[index]=i;
                index++;
                countArray[i]--;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[]array={2,1,5,4,9,8,7,3};
        sort(array);
    }
}
