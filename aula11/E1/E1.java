package E1;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap; 


public class E1 {
    
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(new FileReader("major.txt"));   //open file
        input.useDelimiter("[\\p{Punct}\\s]+");                     //punctuation or whitespace characters

        
        ArrayList<String> words = new ArrayList<>();                //arraylist to store words
        HashMap<String,HashMap<String,Integer>> pairs = new HashMap<>(); //hashmap to store pairs

        
        while (input.hasNext()) {                                   //read file
            String word = input.next();                             //read word
            if (word.length() > 2) {                                //if word is longer than 2 characters
                words.add(word);                                    //add word to arraylist
            }       
        }

        for (int i = 0; i < words.size()-1; i++) {                  
            String currentword = words.get(i);                      //get current word
            String nextword = words.get(i+1);                       //get next word

            if(!pairs.containsKey(currentword)) {                   //if current word is not in hashmap
                HashMap<String,Integer> map = new HashMap<>();      //create new hashmap
                map.put(nextword, 1);                               //add next word to hashmap
                pairs.put(currentword, map);                        //add hashmap to hashmap 

            } else {            
                if(pairs.get(currentword).containsKey(nextword)) {   //if current word is in hashmap and next word is in hashmap
                    pairs.get(currentword).replace(nextword, pairs.get(currentword).get(nextword), pairs.get(currentword).get(nextword) + 1); //increment value
				} else {
					pairs.get(currentword).put(nextword, 1);  //add next word to hashmap
				}
            }
            
        }
        input.close();
        //print hashmap
        for (int j = 0; j < pairs.size(); j++) { 
            System.out.println(pairs.entrySet().toArray()[j].toString());
        }

    }
}
