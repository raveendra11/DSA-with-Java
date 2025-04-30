package StringManipulation;

public class StringCompare {

    String msg1 = "hello, ishu";
    String msg2 = "hello, ishu";
    char msg3[] = msg1.toCharArray();
    char msg4[] = msg2.toCharArray();

    public boolean doCompare() {
        if (msg3.length == msg4.length) {
            for (int i = 0; i < msg3.length; i++) {
                if (msg3[i] != msg4[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringCompare stc = new StringCompare();
        if (stc.doCompare())
            System.out.println("Identical");
        else
            System.out.println("Not identical");
    }
}
