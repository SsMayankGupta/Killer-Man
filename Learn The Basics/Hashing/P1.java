public class P1 {
    public static void main(){
        String str = "qwertyuiopasdfghjklzxcvbnmqwertyuiocvbnmxcvbnASDFGHJKL:WERTYUIcv cfRTYUIOLKXCVBNMKHGFDSXCVBNM<";
        char find = 'q';

        int [] arr = new int[200];

        for(int i=0;i<str.length();i++){
            int index=(int)(str.charAt(i));
            arr[index]++;
        }

        // for(int i=0;i<200;i++){
        //     System.out.println(arr[i]);
        // }

        System.out.println(arr[(int)(find)]);
    }
}