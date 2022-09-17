package com.fastcampus.java.service;

import com.fastcampus.java.logic.JavaSort;
import com.fastcampus.java.logic.Sort;

import java.util.List;

public class SortService {

    private Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("[구현체] : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
