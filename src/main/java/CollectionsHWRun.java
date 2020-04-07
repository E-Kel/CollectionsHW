import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;


public class CollectionsHWRun {
    public static Logger log = Logger.getLogger(CollectionsHWRun.class.getName());

    public static void main(String[] args) {
        String string = "It is a devastated history. Avast, love me it sailor ye weird IT lubber It is a devastated history";
        String wordToCount = "It";
        HashMap stringHashMap = Util.strToHashMap(string);
        log.info(String.format("Task 1: Phrase %s  \ncontains %h words \"%s\" ", string, CollectionOperations.countConreteWordInAString(string,wordToCount),wordToCount));

        log.info("Task 2: Calling in loop .next() method");
        HashSet stringToHash = CollectionOperations.strToHashSet(string);
        CollectionOperations.iteratesThroughAllElemInAHashList(stringToHash);

        log.info(String.format("Task 3:getting HashSet from the map structure %h",CollectionOperations.getHashSetFromHashMap(stringHashMap)));


        log.info("Task 4: printing all elements of the ArrayList");
        CollectionOperations.printAllElementsOfArrayList(Util.strToArrayList(string));

        log.info("Task 5: %h"+ CollectionOperations.reverseArrayList(Util.strToArrayList(string)));

    }

}
