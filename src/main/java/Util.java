import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;

public class Util {
    public static Logger LOGGER = Logger.getLogger(Util.class.getName());

    private static String[] parseToArray(String string) {
        LOGGER.info("Method for getting array of the String is called");

        return string.toLowerCase().split("[,.?! ]");
    }

    public static HashMap strToHashMap(String string) {
        LOGGER.info("Method for getting HashMap of the String is called");
        HashMap hashMap = new HashMap();
        String[] prasedToArray = parseToArray(string);
        for (String str :
                prasedToArray) {
            if (str.equals("")) {
                continue;
            } else {
                hashMap.put(str, null);
            }
        }
        return hashMap;
    }

    public static ArrayList<String> strToArrayList(String string){
        LOGGER.info("Method for getting ArrayList of the String is called");

        ArrayList<String> arrayList = new ArrayList<>();
        String[] prasedToArray = parseToArray(string);
        arrayList.addAll(Arrays.asList(prasedToArray));
        return  arrayList;
    }
    public static HashSet strToHashSet(String str) {
        LOGGER.info("Method for getting HashSet of the String is called");

        HashSet hashSet = new HashSet();
        String[] arrstr = str.toLowerCase().split("[,.?! ]");
        for (String string : arrstr) {
            hashSet.add(string);
        }
        return hashSet;
    }
}


