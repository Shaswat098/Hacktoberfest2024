import java.util.Scanner;

public class Recursion_1 {
   public static int[]F;
    //Fiboancci Series(Recursion with memoization)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//array of size n
        int m=sc.nextInt();//fibonacci term (m<n)
        F=new int[n];
        for(int i=0;i<n;i++){
            F[i]=-1;
        }
        int result=fibo(m);
        System.out.println(result);
    }

 static int fibo(int n ){
    if(n<=1){
        return n;
    }
    else if(F[n]!=-1){
        return F[n];
     }
    else {
        F[n]=fibo(n-1)+fibo(n-2);
    }
    return F[n];
    }
}