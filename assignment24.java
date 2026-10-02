import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {

        String[] words = {
            "cat", "tac", "dog", "god", "act", "rat"
        };

        HashMap<String, Integer> groups = new HashMap<>();

        for (String word : words) {

            // Convert word to character array
            char[] chars = word.toCharArray();

            // Sort the characters
            Arrays.sort(chars);

            // Create a key from sorted characters
            String key = new String(chars);

            // Add to anagram group
            groups.put(key, groups.getOrDefault(key, 0) + 1);
        }

        System.out.println("Number of anagram groups = " + groups.size());
    }
}
