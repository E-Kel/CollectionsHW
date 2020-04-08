import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;

public class Util {
    private static Logger LOGGER = Logger.getLogger(Util.class.getName());

    private static String[] parseToArray(String string) {
        LOGGER.info("Method for getting array of the String is called");
        return string.toLowerCase().split("[,.?! ]");

    }

    public static HashMap<String, Object> strToHashMap(String string) {
        LOGGER.info("Method for getting HashMap of the String is called");
        HashMap<String, Object> hashMap = new HashMap<>();
        String[] prasedToArray = parseToArray(string);
        for (String str :
                prasedToArray) {
            if (str.isEmpty()) continue;
            else hashMap.put(str, null);
        }
        return hashMap;
    }

    public static ArrayList<String> strToArrayList(String string) {
        LOGGER.info("Method for getting ArrayList of the String is called");
        String[] prasedToArray = parseToArray(string);
        return new ArrayList<>(Arrays.asList(prasedToArray));
    }

    public static HashSet<String> strToHashSet(String str) { //task3
        LOGGER.info("Method for getting HshSet of the String is called");
        String[] arrstr = str.toLowerCase().split("[,.?! ]");
        return new HashSet<>(Arrays.asList(arrstr));
    }
}



