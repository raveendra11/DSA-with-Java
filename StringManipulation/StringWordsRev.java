package StringManipulation;

public class StringWordsRev {

    String sentence = "Flowers are beautiful";

    String words[] = sentence.split(" ");

    public void doWordsRev() {
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {
        StringWordsRev swr = new StringWordsRev();
        swr.doWordsRev();
    }
}
