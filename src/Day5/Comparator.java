package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator implements Comparable {

    public static void main(String[] args) {
        List<String> listComparator = new ArrayList<>();
        listComparator.add("1sfsdf");
        listComparator.add("5sfdfdf");
        listComparator.add("6sfsddfdfsdff");
        listComparator.add("2sfdgsfbcvsdf");
        listComparator.add("3sfxcvxcvsdf");
        listComparator.add("8sfscxvxcvxdf");

        //sorting has to be executed by Collections.sort...
        Collections.sort(listComparator);
        System.out.println(listComparator.toString());

    }

    @Override
    //...or by ourselves defined comparator
    public int compareTo(Object o) {
        return 0;
    }
}
