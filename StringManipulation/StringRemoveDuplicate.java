package StringManipulation;

public class StringRemoveDuplicate {

    String fruit = "banana";

    char name[] = fruit.toCharArray();

    public void doRemoveDuplicate() {

        boolean[] seen = new boolean[256]; // ASCII character tracking

        for (int i = 0; i < name.length; i++) {
            if (!seen[name[i]]) {
                System.out.print(name[i]);
                seen[name[i]] = true;
            }
        }

        //My Garbage Solution😂
        /*for(int i =0; i<name.length-1;i++) {
            for (int j = 1; j < name.length; j++) {
                if (name[i] == name[j] && i != j) {
                    name[j] =  ' ';
                }
            }
        }*/

        /*for(int k=0 ; k< name.length-1;k++){
            System.out.print(name[k]);
        }*/
    }

    public static void main(String[] args) {

        StringRemoveDuplicate srd = new StringRemoveDuplicate();
        srd.doRemoveDuplicate();
    }
}
