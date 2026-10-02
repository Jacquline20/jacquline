import java.util.HashSet;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        int[] arr = {-5, 5, -3, 3, 7, -7, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        System.out.println("Number of distinct absolute values = " + set.size());
    }
}
