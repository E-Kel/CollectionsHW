import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionsHWRun {
    private static Logger LOGGER = Logger.getLogger(CollectionsHWRun.class.getName());

    public static void main(String[] args) {

        String string = "It is a devastated history. Avast, love me it sailor ye weird IT lubber It is a devastated history";
        String wordToCount = "It";
        HashMap<String, Object> stringHashMap = Util.strToHashMap(string);
        LOGGER.info(String.format("Task 1: Phrase \"%s\" \ncontains %h words \"%s\" ", string, CollectionOperations.countConreteWordInAString(string, wordToCount), wordToCount));

        LOGGER.info("Task 2: Calling in loop .next() method");
        HashSet<String> stringToHash = Util.strToHashSet(string);
        CollectionOperations.iteratesThroughAllElemInAHashList(stringToHash);

        LOGGER.info(String.format("Task 3:getting HashSet from the map structure %h", CollectionOperations.getHashSetFromHashMap(stringHashMap)));


        LOGGER.info("Task 4: printing all elements of the ArrayList");
        CollectionOperations.printAllElementsOfArrayList(Util.strToArrayList(string));

        LOGGER.info("Task 5: " + CollectionOperations.reverseArrayList(Util.strToArrayList(string)));

    }

}
