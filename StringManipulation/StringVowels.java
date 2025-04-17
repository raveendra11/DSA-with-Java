package StringManipulation;

public class StringVowels {

    String msg = "Hello, World";

    public void countVowels(){
        int count =0;
        String vowels ="aeiou";

        for(char ch : msg.toLowerCase().toCharArray()){
            if(vowels.indexOf(ch) !=-1){
                count ++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        StringVowels stv = new StringVowels();
        stv.countVowels();
    }
}
