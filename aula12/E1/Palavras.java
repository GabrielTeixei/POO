package aula12.E1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Palavras {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("words.txt");
        Scanner input = new Scanner(file);   // Open file
        TreeMap<String, Integer> map = new TreeMap<>();

        int count = 0;
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            count++;

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1); // Increment count
            } else {
                map.put(word, 1); // Add new entry
            }
        }

        System.out.println("Total words: " + count);
        System.out.println("Total different words: " + map.size());

        input.close();
    }
}
