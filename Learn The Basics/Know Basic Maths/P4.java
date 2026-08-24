public class P4 {
    public static void main(){
        int n1=12,n2=16,gcd=1;
        for(int i=2;i<=(n1>=n2?n2:n1);i++){
            if(n1%i==0 && n2%i==0){
                gcd=Math.max(gcd,i);
            }
        }
        System.out.println(gcd);
    }
}