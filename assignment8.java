public class SentenceFormat {
    public static void main(String[] args) {

        String sentence = "Java is a programming language";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Display the words
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Rebuild the sentence in a new format
        String newSentence = String.join("-", words);

        System.out.println("New format: " + newSentence);
    }
}
