package Basic_A2_Implement_Phonebook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Implement Phonebook
 *
 * (Name - Number)
 *
 *     Demonstrate adding, searching, removing and printing of all key-value pairs.
 */
public class Main {

    public static void main(String[] args) {

        HashMap<String, Long> phoneBook = new HashMap<>();
        phoneBook.put("Judith Lang-Ladurner", +4365032456783L);
        phoneBook.put("Benjamin Schneider", +4367698012245L);
        phoneBook.put("Annina Henninger", +4367799623456L);
        phoneBook.put("Christian Ronaldo", +4366034523678L);
        phoneBook.put("Simon Blaha", +4367698345612L);
        phoneBook.put("Jenny Tang", +4387623456798L);

        //System.out.println(phoneBook.containsKey("Judith Lang-Ladurner"));
        //System.out.println(phoneBook.containsValue(+4367698012245L));
        //System.out.println(phoneBook.get("Annina Henninger"));
        System.out.println();

        Iterator<Map.Entry<String, Long>> it = phoneBook.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Long> pair = (Map.Entry<String, Long>)it.next();
            if(pair.getValue().equals(+4367698012245L)){
                System.out.println(pair.getKey());
            }
        }
        phoneBook.remove("Christian Ronaldo");

        for(Map.Entry<String, Long> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
