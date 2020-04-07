import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;

public class Util {
    Logger LOGGER = Logger.getLogger(Util.class.getName());

    private static String[] parseToArray(String string) {
        return string.toLowerCase().split("[,.?! ]");

    }

    public static HashMap strToHashMap(String string) {
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
        ArrayList<String> arrayList = new ArrayList<>();
        String[] prasedToArray = parseToArray(string);
        arrayList.addAll(Arrays.asList(prasedToArray));
        return  arrayList;
    }
    public static HashSet strToHashSet(String str) { //task3
        log.info("Method that iterating trough HashSet is called");

        HashSet hashSet = new HashSet();
        String[] arrstr = str.toLowerCase().split("[,.?! ]");
        for (String string : arrstr) {
            hashSet.add(string);
        }
        return hashSet;
    }
}


