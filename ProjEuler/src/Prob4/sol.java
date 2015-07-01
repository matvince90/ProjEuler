package Prob4;

/**
 *
 * @author msant080
 */
public class sol {
    
    static int ans = 0;
    public static void main (String[] args) {
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                if (isPalindrome(String.valueOf(i*j))) {
                    if (ans < (i*j)) {
                        ans = i*j;
                    }
                }
            }
        }
        
        //isPalindrome(String.valueOf(1001001));
        System.out.println("Answer: " + ans);
    }
    
    public static boolean isPalindrome(String in) {
        if (in.length() < 2) {
            return true;
        } else {
            if (in.startsWith(in.substring(in.length()-1)))
                return isPalindrome(in.substring(1,in.length()-1));
            else {
                return false;
                }
        }
    }
}
