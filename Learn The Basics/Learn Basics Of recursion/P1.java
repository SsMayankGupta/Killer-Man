public class P1 {
    public static void main(){
        printNumbers(10);
    }
    static int printNumbers(int n){
        if(n==0) return 0;
        System.out.println(n);
        return printNumbers(n-1);
    }
}