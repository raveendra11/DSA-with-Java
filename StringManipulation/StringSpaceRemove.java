package StringManipulation;

public class StringSpaceRemove {

    String msg = "Hey! Whatsup, ISHU?";

    char[] response = msg.toCharArray();

    int index;

    public void doSpaceRemove() {

        int k = 0;

        while (k < response.length) {

            if (response[k] == ' ') {

                index = k;

                for (int j = index; j < response.length - 1; j++) {

                    response[j] = response[j + 1];

                }
                response[response.length - 1] = ' ';
            }
            k++;
        }

        for (int i = 0; i < response.length - 1; i++) {

            System.out.print(response[i]);

        }
    }

    public static void main(String[] args) {

        StringSpaceRemove ssr = new StringSpaceRemove();
        ssr.doSpaceRemove();
    }
}
