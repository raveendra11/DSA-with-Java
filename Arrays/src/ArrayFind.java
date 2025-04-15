public class ArrayFind {
    int rollNumbers[] = new int[]{101, 102, 103, 104, 105, 106};

    int find_element = 106;

    public int findElement() {
        for (int i : rollNumbers) {
            if (i == find_element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayFind arf = new ArrayFind();
        if (arf.findElement() == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element exists");
        }

    }
}
