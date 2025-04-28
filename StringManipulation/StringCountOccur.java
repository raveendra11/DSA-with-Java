package StringManipulation;

public class StringCountOccur {

    String fruit = "strawberry";
    int count = 0;
    char ch = 'r';

    public void doCount() {
        char[] fname = fruit.toCharArray();

        for (int i = 0; i < fname.length; i++) {
            if (ch == fruit.charAt(i))
                count++;
        }
        System.out.println(count);
    }
        public static void main (String[]args){
            StringCountOccur sco = new StringCountOccur();
            sco.doCount();
        }
    }

