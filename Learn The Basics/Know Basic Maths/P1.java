public class P1 {
    public static void main(){
      int n =234567898;
    int d=1;
      for(int i=1;i<=n;i++){
        d++;
        n/=10;
        if(n==0){
            break;
        }
      }

      System.out.println(d);  
    }
}