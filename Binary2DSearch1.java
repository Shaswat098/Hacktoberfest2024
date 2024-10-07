//Q.When the array is completely sorted
public class Binary2DSearch1{
    public static void main(String[]args){
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
    }
    public static int[]bianrySearch(int arr[],int row,int cstart,int cend,int target){
        int mid=cstart+(cstart-cend)/2;
        if(mid==target){
            return new int[]{row,mid};
        }
        else if(mid<target){
            cstart=mid+1;
        }
        else{
            cend=mid-1;
        }
        return new int[]{-1,-1};
    }
    public static int[]search(int arr[][],int target){
        int rows=arr.length;
        int col=arr[0].length;
        if(rows==1){
            return bianrySearch(arr[0],0,0,col-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=col/2;
        while(rstart<rend-1){
            int mid=rstart+(rend-rstart)/2;
            if(target==arr[mid][cmid]){
                return new int[]{mid,cmid};
            }
            else if(target<arr[mid][cmid]){
                rend=mid;
            }
            else{
                rstart=mid;
            }
        }
        if(arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        else if(arr[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        return new int[]{-1,-1};
    }
}
