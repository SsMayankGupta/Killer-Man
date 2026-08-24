public class P3 {
    public static void main(){
        int num=12390907321;
        int nnum=0,cnum=num;

        for(int i=1;i<=num;i++){
            nnum=nnum*10+cnum%10;cnum/=10; if(cnum==0)break;
        }

        System.out.println(nnum==num);
    }
}