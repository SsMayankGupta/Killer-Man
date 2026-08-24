public class P2 {
    public static void main(){

        int num=34567878;int cnum=num;
        int nnum=0;
        for(int i=1;i<=cnum;i++){
            nnum=nnum*10+num%10;num/=10;if(num==0)break;
        }

        System.out.println(nnum);
    }
}