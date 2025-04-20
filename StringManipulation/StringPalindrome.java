package StringManipulation;

public class StringPalindrome {

    String name = "OYO";
    String nameReverse = "";

    public String checkPalindrome() {

        for (int i = name.length() - 1; i >= 0; i--) {
            nameReverse = nameReverse + name.charAt(i);
        }

        if (name.equals(nameReverse))
            return "Is a palindrome";
        else
            return "Is not a palindrome";
    }

    public static void main(String[] args) {

        StringPalindrome stp = new StringPalindrome();
        System.out.println(stp.checkPalindrome());
    }
}
