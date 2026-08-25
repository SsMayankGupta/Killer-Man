public class P5 {
    public static void main(){
        int num=1,cnum=num;int sum=0;
        int digits=0;
        for(int i=1;i<=cnum;i++){
            digits=num%10;
            sum+=Math.pow(digits,3);
            num/=10;
            if(num==0)break;
        }
        if(num==sum)
        System.out.println("Armstrong number");
        else
        System.out.println("Not Armstrong number");

    }
}