import org.apache.log4j.Logger;

import java.util.*;


public class Tasks {
    static final Logger log = Logger.getLogger(Tasks.class.getName());

    public static HashSet strToHash (String str){ //task3
        HashSet hashSet = new HashSet();
        String[] arrstr = str.toLowerCase().split("[,.?! ]");
        for (String string: arrstr
        ) {
            hashSet.add(string);
        }
        return hashSet;
    }
    public static int task1(String fromPhrase, String wordToCount){
        HashMap hashMap = new HashMap();
        wordToCount = wordToCount.toLowerCase().replaceAll("[,.?! ]","");
        String[] PhraseToArray = fromPhrase.toLowerCase().split("[,.?! ]");
        int counter = 0;
        for (int i=0; i< PhraseToArray.length; i++)
         {String key = PhraseToArray[i];
            if (key.equals("")) {
                continue;
            } else{
                hashMap.put(i, key);
            }
            if (key.equals(wordToCount)){
                counter++;
            }
        }
        return counter;
    }

    public static void task2(HashSet hashSet){
        Iterator hashSetIter = hashSet.iterator();
        for (int i  = 0; i<hashSet.size(); i++)
            log.trace(String.format("Next element is %h", hashSetIter.next().toString()));

    }



    public static HashSet task3(HashMap hashMap){
        return new HashSet(hashMap.values());
    }

    public static void task4(ArrayList<String> arrayList){
        for (String str :
                arrayList) {
            log.trace(str);
        }
    }

    public static ArrayList<String> task5(ArrayList arrayList){//    //reverse ArrayList
                  Collections.reverse(arrayList);
                    return arrayList;
    }

}
