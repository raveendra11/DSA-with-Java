package StringManipulation;

public class StringReverse {

    String name = "ravi";

    String nameRev = "";

    public void doReverse() {

        for (int i = name.length() - 1; i >= 0; i--) {
            nameRev = nameRev + name.charAt(i);
        }
        System.out.println("Reversed name is : "+nameRev);
    }

    public static void main(String[] args) {

        StringReverse srv = new StringReverse();
        srv.doReverse();

    }
}
