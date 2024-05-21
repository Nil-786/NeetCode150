package Solutions;
// https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(" "))
            return true;
        s= s.toLowerCase();
        StringBuilder ss = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ss.append(c);
            }
        }

        int i = 0;
        int j = ss.length() - 1;
        while (i < j) {
            if (ss.charAt(i) != ss.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
