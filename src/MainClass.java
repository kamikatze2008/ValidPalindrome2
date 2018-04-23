public class MainClass {

    public static void main(String[] args) {
        String a = "abc";
        System.out.println("Is " + a + " palindrome? " + validPalindrome(a));

    }

    public static boolean validPalindrome(String s) {
        int sLength = s.length();

        int startIndex = 0;
        int lastIndex = sLength - 1;

        while (startIndex < lastIndex) {
            if (s.charAt(startIndex) != s.charAt(lastIndex)) {
                return checkPalindrome(s.substring(startIndex + 1, lastIndex + 1)) || checkPalindrome(s.substring(startIndex, lastIndex));
            }
            startIndex++;
            lastIndex--;
        }
        return true;
    }

    public static boolean checkPalindrome(String s) {
        int sLength = s.length();
        if (sLength > 1) {
            int startIndex = 0;
            int lastIndex = sLength - 1;

            while (startIndex < lastIndex) {
                if (s.charAt(startIndex) != s.charAt(lastIndex)) {
                    return false;
                }
                startIndex++;
                lastIndex--;
            }
        }
        return true;
    }
}
