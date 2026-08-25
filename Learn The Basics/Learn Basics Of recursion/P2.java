public class P2 {
    public static void main(){
        printN(1);
    }
    static int printN(int n){
        if(n==11)return 0;
        System.out.println(n);
        return printN(n+1);
    }
}