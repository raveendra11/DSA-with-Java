package Arrays;
import java.util.HashSet;
public class ArrayDuplicateES {
        public boolean hasDuplicate(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for (int num : nums) {
                if (seen.contains(num)) {
                    return true; // Found a duplicate
                }
                seen.add(num);
            }
            return false; // No duplicates
        }

    public static void main(String[] args) {
        ArrayDuplicateES object = new ArrayDuplicateES();
        int[] nums = {1,2,3,4,5};
        System.out.println(object.hasDuplicate(nums));

    }

}

