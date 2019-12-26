package newpcg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class CollectionsEx {

    List<Integer> listOfInts = new ArrayList<>();
    Set<String> setOfStrings = new HashSet<>();
    Map<String, Boolean> randomMap = new HashMap<>();
    private static Logger LOGGER = LogManager.getLogger();
//    private static Logger logger = LogManager.getLogger();

    public CollectionsEx(){}

    public void someMethod() {
        LOGGER.info("Method execution started");
        listOfInts.addAll(Arrays.asList(123,123,123,45));
//        System.out.println(listOfInts);

        listOfInts.remove(3);

        if (!listOfInts.isEmpty()) {
            LOGGER.error("List of ints is empty for some reason");
        }
//        System.out.println(listOfInts);
//        List<String> localList = Arrays.asList("asd", "qweqwe", "asd");
//        System.out.println(localList);
//        localList.remove("asd");
        setOfStrings.addAll(Arrays.asList("123","123","123","45"));
        LOGGER.warn(setOfStrings);
        randomMap.put("key", false);
        randomMap.put("key1", true);
        randomMap.put("key1", false);
        LOGGER.debug(randomMap);
//        listOfInts.forEach(item -> System.out.println(item));
        LOGGER.info("Finished");
    }

    public static void main(String[] args) {
        CollectionsEx ex = new CollectionsEx();
        ex.someMethod();
    }
}
