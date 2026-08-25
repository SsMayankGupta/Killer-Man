public class P5 {
    public static void main(){
        String s="123456654321";
        System.out.println(palindrome(s,0,s.length()-1));
    }

    static boolean palindrome(String s, int st, int end) {
    if (st >= end) return true; // ***************** base case
    if (s.charAt(st) == s.charAt(end)) {
        return palindrome(s, st + 1, end - 1);
    } else {
        return false;
    }
}

}