import org.apache.log4j.Logger;

import java.util.HashSet;


public class CollectionsHWRun {
    public static Logger log = Logger.getLogger(CollectionsHWRun.class.getName());

    public static void main(String[] args) {
        String lorem = "It is a devastated history. Avast, love me it sailor ye weird IT lubber It is a devastated history";
        String wordToCount = "It";
        log.info(String.format("Task 1: Pharse %s  \ncontains %h words \"%s\" ", lorem, Tasks.task1(lorem,wordToCount),wordToCount));

        log.info("Task2: Calling in loop .next() method");
        HashSet loremToHash = Tasks.strToHash(lorem);
        Tasks.task2(loremToHash);

        log.info("getting HashSet from the map structure");




    }
}
