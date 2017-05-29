package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

/**
 * Created by openc on 29/5/2017.
 *
 * ArrayList can contain Duplicates
 * ArrayList maintain Insertion Order
 * ArrayList are not Threadsafe , If multiple Threads access arrayList it wont give correct results
 * ArrayList is slow in Insertion and deletion
 * ArrayList extends AbstractList and Implements List Interface
 *
 */
public class ArrayListImpl implements ArrayListInr {

    List<Integer> alist;
    List<Integer> blist;

    ArrayListImpl() {
        this.alist = new ArrayList();
        this.blist = new ArrayList();
        InsertValuesInArrayList(alist,blist);
        System.out.println("Minmum :"+calculateMinimum(alist));
        System.out.println("Maximum :"+calculateMaximum(alist));
        diffImpls(alist,blist);
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
        blist.add(62);
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
            if (next.compareTo(candidate) > 0) {
                candidate = next;
            }
        }
        return candidate;
    }

    public void diffImpls(List<Integer> alist,List<Integer> blist){

        alist.add(7);
        alist.remove(1);
        System.out.println(alist.size());
        System.out.println(blist.isEmpty());

        /*
        Collections.addAll()
         */
        System.out.println("--------alist.addAll(blist)-----------");
        alist.addAll(blist);
        for (Integer value:alist){
            System.out.println(value);
        }
        System.out.println("*********************************************");
        /*
        Collections.removeAll()
         */
        System.out.println("--------alist.removeAll(blist)-----------");
        alist.removeAll(blist);
        for (Integer value:alist){
            System.out.println(value);
        }
        System.out.println("*********************************************");
         /*
        Collections.retainAll()
         */
        System.out.println("--------alist.retainAll(blist)-----------");
        alist.retainAll(blist);
        for (Integer value:alist){
            System.out.println(value);
        }
        System.out.println("*********************************************");
       // blist.clear();
        System.out.println(blist);
        if(alist.contains(3)) System.out.println(alist.get(3)+"available");
        if(alist.containsAll(blist)) {
            System.out.println("alist contains blist");
        }else{
            System.out.println("alist not contains blist");
        }
        System.out.println("*********************************************");
       // Arrays a[]=new Arrays[];
       // a=alist.toArray();

    }
}
