import org.apache.log4j.Logger;

import java.util.*;

public class CollectionOperations {
    static final Logger log = Logger.getLogger(CollectionOperations.class.getName());

    public static HashSet<String> strToHashSet(String str) { //task3
        log.info("Method that iterating trough HashSet is called");
        String[] arrstr = str.toLowerCase().split("[,.?! ]");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(arrstr));
        return hashSet;
    }
    public static int countConreteWordInAString(String fromPhrase, String wordToCount) {
        log.trace("Method that count amount of the concrete word in the string has been called");
        HashMap<Integer, String> hashMap = new HashMap<>();
        wordToCount = wordToCount.toLowerCase().replaceAll("[,.?! ]", "");
        String[] parseToArray = fromPhrase.toLowerCase().split("[,.?! ]");
        int counter = 0;
        for (int i = 0; i < parseToArray.length; i++) {
            String key = parseToArray[i];
            if (key.equals("")) {
                continue;
            } else {
                hashMap.put(i, key);
            }
            if (key.equals(wordToCount)) {
                counter++;
            }
        }
        return counter;
    }
    public static void iteratesThroughAllElemInAHashList(HashSet<String> hashSet) {
        log.info("Method that iterating trough HashSet is called");

        Iterator<String> hashSetIter = hashSet.iterator();
        for (int i = 0; i < hashSet.size(); i++)
            log.trace(String.format("Next element is %h", hashSetIter.next()));

    }
    public static HashSet<String> getHashSetFromHashMap(HashMap hashMap) {
        log.info("Method that converts HashMap to HashSet is called");

        return new HashSet<String>(hashMap.values());
    }
    public static void printAllElementsOfArrayList(ArrayList<String> arrayList) {
        log.info("Method that prints all the elements of the ArrayList is called");

        for (String str : arrayList) {
            log.trace(str);
        }
    }
    public static ArrayList<String> reverseArrayList(ArrayList<String> arrayList) {//    //reverse ArrayList
        log.info("Method that reversing ArrayList is called");
        Collections.reverse(arrayList);
        return arrayList;
    }
}
