package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by openc on 28/5/2017.
 */
public interface OrderInterface {
    public ArrayList processOrder(ArrayList<String> e);

    public void InsertValuesInArrayList(List<Integer> alist, List<Integer> blist);
    public Integer calculateMinimum(List<Integer> list);
    public Integer calculateMaximum(List<Integer> list);
    public void diffImpls(List<Integer> alist,List<Integer> blist);


}
