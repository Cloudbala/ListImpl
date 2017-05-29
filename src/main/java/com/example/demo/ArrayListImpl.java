package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Created by openc on 29/5/2017.
 */
public class ArrayListImpl implements ArrayListInr {

    List<Integer> alist;
    List<Integer> blist;

    ArrayListImpl() {
        this.alist = new ArrayList();
        this.blist = new ArrayList();
        InsertValuesInArrayList(alist,blist);
    }

    public void InsertValuesInArrayList(List<Integer> alist , List<Integer> blist) {
        alist.add(10);
        alist.add(16);
        alist.add(6);
        alist.add(5);
        alist.add(62);
        alist.add(8);
        alist.add(21);
        blist.add(50);
        blist.add(34);
        blist.add(67);
        blist.add(50);
        blist.add(29);
        blist.add(9);
        blist.add(22);
    }

    public Integer calculateMinimum(List<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        Integer candidate = itr.next();
        while (itr.hasNext()) {
            Integer next = itr.next();
          /*  commented code is an alternative approach
            Comparator comp;
            if(comp.compare(next,candidate)<0)*/
            if (next.compareTo(candidate) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }

    public Integer calculateMaximum(List<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        Integer candidate = itr.next();
        while (itr.hasNext()) {
            Integer next = itr.next();
            if (next.compareTo(candidate) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }

    public void diffImpls(List<Integer> alist,List<Integer> blist){
        alist.addAll(blist);
        for (Integer value:alist){
            System.out.println(value);
        }
    }
}
