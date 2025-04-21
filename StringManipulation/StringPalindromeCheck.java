package StringManipulation;

public class StringPalindromeCheck {

    String msg = "RADAR";

    public boolean checkReverse() {
        int i = 0;
        for (; i < msg.length() - 1; ) {
            for (int j = msg.length() - 1; j >= 0; j--) {
                if (i == j)
                    return true;
                if (msg.charAt(i) != msg.charAt(j)) {
                    return false;
                }
                i++;

            }
        }
        return true;
    }

    public static void main(String[] args) {

        StringPalindromeCheck spc = new StringPalindromeCheck();
        if (spc.checkReverse()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
