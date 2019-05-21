package Basic_A1_Worm_up;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> animals = new HashMap<String, String>();

        animals.put("dog", "woof");
        animals.put("cat", "meow");
        animals.put("cow", "mooh");
        animals.put("dolphin", "queek");


        System.out.println(animals.get("dog"));
        System.out.println(animals.containsValue("woof"));
        System.out.println(animals.containsKey("dog"));
        System.out.println(animals.size());
        /*animals.clear();*/
        System.out.println("===============================");
        Iterator<Map.Entry<String, String>> it = animals.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println("=================================");

        animals.remove("dolphin");

        for (Map.Entry<String, String> entry : animals.entrySet()) {

            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        System.out.println("=================================");
        animals.put("dog","woofi");

        System.out.println(animals.get("dog"));

        animals.replace("dog", "woofi", "woof");
        System.out.println(animals.get("dog"));

    }
}
