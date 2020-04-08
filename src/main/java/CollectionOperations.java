import org.apache.log4j.Logger;

import java.util.*;

public class CollectionOperations {
    static final Logger LOGGER = Logger.getLogger(CollectionOperations.class.getName());

    public static int countConreteWordInAString(String fromPhrase, String wordToCount) {
        LOGGER.trace("Method that count amount of the concrete word in the string has been called");
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
        LOGGER.info("Method that iterating trough HashSet is called");
        Iterator<String> hashSetIter = hashSet.iterator();
        while (hashSetIter.hasNext()) {
            LOGGER.trace(String.format("Next element is %h", hashSetIter.next()));
        }
    }

    public static HashSet<String> getHashSetFromHashMap(HashMap hashMap) {
        LOGGER.info("Method that converts HashMap to HashSet is called");
        return new HashSet<String>(hashMap.values());
    }

    public static void printAllElementsOfArrayList(ArrayList<String> arrayList) {
        LOGGER.info("Method that prints all the elements of the ArrayList is called");


        for (String str : arrayList) {
            LOGGER.trace(str);
        }
    }

    public static ArrayList<String> reverseArrayList(ArrayList<String> arrayList) {//    //reverse ArrayList
        LOGGER.info("Method that reversing ArrayList is called");
        Collections.reverse(arrayList);
        return arrayList;
    }
}
