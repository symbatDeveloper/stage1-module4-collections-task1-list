package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
    ArrayList<String> arr = new ArrayList<>();
    int i=1;
    for( String str : sourceList){
    if(i++ % 3 == 0){
    arr.add(str);
    arr.add(str);
    }

    }
    return  arr;
    }
    }
