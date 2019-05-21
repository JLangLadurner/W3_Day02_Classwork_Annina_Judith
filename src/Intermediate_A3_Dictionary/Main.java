package Intermediate_A3_Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * implement Dictionary Application
 *
 * (Word - Meaning, Description)
 *
 *     Discuss how would you model the meaning and description in a single value of hashmap pair.
 *
 *     Demonstrate adding, searching, removing and printing of all key-value pairs.
 */
public class Main {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> dictionary  = new HashMap<>();

        ArrayList<String> animal = new ArrayList<>();
        animal.add("Tier");
        animal.add("any member of the kingdom Animalia");
        dictionary.put("animal", animal);

        ArrayList<String> cat = new ArrayList<>();
        cat.add("Katze");
        cat.add("a small domesticated carnivore");
        dictionary.put("cat", cat);

        ArrayList<String> dog = new ArrayList<>();
        dog.add("Hund");
        dog.add("a domesticated canid");
        dictionary.put("dog", dog);

        System.out.println(dictionary.get("dog").get(0));

        for(Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " is a " + entry.getValue().get(0) + " that means it is "
                    + entry.getValue().get(1));
        }

        dictionary.remove("animal");

        System.out.println("******************");

        for(Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " is a " + entry.getValue().get(0) + " that means it is "
                    + entry.getValue().get(1));
        }
    }
}
