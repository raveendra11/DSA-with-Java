package StringManipulation;

public class StringCountWords {

    String msg = "Hey, ISHU! What are you up to?";

    String[] msg1 = msg.split(" ");

    int count = 0;

    public void doCount() {

        for (int i = 0; i < msg1.length; i++) {

            count++;
        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        StringCountWords scw = new StringCountWords();
        scw.doCount();
    }
}
