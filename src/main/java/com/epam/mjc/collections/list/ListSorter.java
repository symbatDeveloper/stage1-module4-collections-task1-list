package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
    sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
    int int_a = Integer.parseInt(a);
    int int_b = Integer.parseInt(b);

    if(int_a * int_a > int_b * int_b)
        return 1;

    else if(int_a * int_a < int_b * int_b)
        return -1;
    else
        return  Integer.compare(int_a, int_b);
    }
}
