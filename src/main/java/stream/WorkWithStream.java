package stream;

import java.util.ArrayList;

public class WorkWithStream {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList();

        list.add("Kuku");

        list.stream().filter("Kuku"::equals).count();

        list.forEach((String value) -> System.out.println(value));


    }
    
    

}
