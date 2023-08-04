package aula12.E2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        try {
            File file = new File("A_Cidade_e_as_serras.txt");
            Scanner scanner = new Scanner(file);

            // Create a TreeMap to store words grouped by initial
            TreeMap<Character, HashMap<String, Integer>> wordMap = new TreeMap<>();

            // Read the file and process each word
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();

                // Ignore words with less than three characters
                if (word.length() < 3) {
                    continue;
                }

                char initial = word.charAt(0);

                // Check if the initial already exists in the map
                if (!wordMap.containsKey(initial)) {
                    // If it doesn't exist, create a new HashMap for that initial
                    wordMap.put(initial, new HashMap<>());
                }

                HashMap<String, Integer> initialMap = wordMap.get(initial);

                // Update the count of the word in the initial map
                initialMap.put(word, initialMap.getOrDefault(word, 0) + 1);
            }

            // Close the scanner
            scanner.close();

            // Iterate over each initial in alphabetical order
            for (char initial : wordMap.keySet()) {
                System.out.print(initial + ": ");

                // Get the map of words for the current initial
                HashMap<String, Integer> initialMap = wordMap.get(initial);

                // Sort the words alphabetically
                List<String> sortedWords = new ArrayList<>(initialMap.keySet());
                Collections.sort(sortedWords);

                // Iterate over the sorted words and print them
                for (String word : sortedWords) {
                    int count = initialMap.get(word);
                    System.out.print(word + ", " + count + "; ");
                }

                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
