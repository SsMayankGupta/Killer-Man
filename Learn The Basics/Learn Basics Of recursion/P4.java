public class P4{
    public static void main(){
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n==1 || n==0 )return 1;
        return n*factorial(n-1);
    }
}