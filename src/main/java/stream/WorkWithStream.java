package stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class WorkWithStream {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();

        String str = "Alex";

        list.add("Kuku");

        list.stream().filter("Kuku"::equals).count();

        list.forEach((String value) -> System.out.println(value));
        List<Integer> numbers = asList(1, 2, 3, 4);
        //Set<Integer> numbers = new HashSet(asList(4, 3, 2, 1));
        List<Integer> sameOrder = numbers.stream().sorted().collect(toList());
    }
}
