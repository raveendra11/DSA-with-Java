public class ArrayFind {
    int rollNumbers[] = new int[]{101, 102, 103, 104, 105, 106};

    int find_element = 103;

    public void findElement() {
        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] == find_element) {
                System.out.println("Element exists");
                break;
            } else {
                System.out.println("Element not found");
                break;
            }

        }
    }

    public static void main(String[] args) {

        ArrayFind arf = new ArrayFind();
        arf.findElement();

    }
}
