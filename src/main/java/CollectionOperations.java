import org.apache.log4j.Logger;

import java.util.*;

public class CollectionOperations {
    static final Logger log = Logger.getLogger(CollectionOperations.class.getName());

    public static HashSet strToHashSet(String str) { //task3
        log.info("Method that iterating trough HashSet is called");

        HashSet hashSet = new HashSet();
        String[] arrstr = str.toLowerCase().split("[,.?! ]");
        for (String string : arrstr) {
            hashSet.add(string);
        }
        return hashSet;
    }
    public static int countConreteWordInAString(String fromPhrase, String wordToCount) {
        log.trace("A method that count amount of the concrete word in the string has been called");
        HashMap hashMap = new HashMap();
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
    public static void iteratesThroughAllElemInAHashList(HashSet hashSet) {
        log.info("Method that iterating trough HashSet is called");

        Iterator hashSetIter = hashSet.iterator();
        for (int i = 0; i < hashSet.size(); i++)
            log.trace(String.format("Next element is %h", hashSetIter.next().toString()));

    }
    public static HashSet getHashSetFromHashMap(HashMap hashMap) {
        log.info("Method that converts HashMap to HashSet is called");

        return new HashSet(hashMap.values());
    }
    public static void printAllElementsOfArrayList(ArrayList<String> arrayList) {
        log.info("Method that prints all the elements of the ArrayList is called");

        for (String str : arrayList) {
            log.trace(str);
        }
    }
    public static ArrayList<String> reverseArrayList(ArrayList arrayList) {//    //reverse ArrayList
        log.info("Method that reversing ArrayList is called");
        Collections.reverse(arrayList);
        return arrayList;
    }
}
