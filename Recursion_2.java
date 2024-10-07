public class Recursion_2 {
    //Exponentiation
    public static void main(String[] args) {
        int n=3;
        int m=78;
        int result=pow(m,n);
        System.out.println(result);
    }
    static int pow(int m,int n){
        if(n==0){
            return 1;
        }
        else if(n%2==0){
            int y=pow(m,n/2);
            return y*y;
        }
        return m*pow(m,n-1);
    }
}
