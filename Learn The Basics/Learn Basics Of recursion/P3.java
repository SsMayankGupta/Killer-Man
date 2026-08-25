public class P3 {
    public static void main(){
        int [] arr = reverse(new int[]{1,2,3,4,5,6,7,8,9},0,8);
        for(int val:arr){
            System.out.println(val);
        }
        
    }
    static int [] reverse(int [] arr,int st,int end){
        if(st==end) return arr;
        arr[st]+=arr[end];//10,20,30
        arr[end]=arr[st]-arr[end];//30-20
        arr[st]=arr[st]-arr[end];//20
        return reverse(arr,st+1,end-1);
    }
}