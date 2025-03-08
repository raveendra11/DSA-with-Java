public class ArrayFind {
    int rollNumbers[] = new int[]{101, 102, 103, 104, 105, 106};

    int find_element = 109;

    public boolean findElement() {
        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] == find_element) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        ArrayFind arf = new ArrayFind();
        if (arf.findElement()) {
            System.out.println("Element exists");
        } else {
            System.out.println("Element not found.");
        }

    }
}
