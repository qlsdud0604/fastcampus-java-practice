package com.fastcampus.java;

import com.fastcampus.java.logic.BubbleSort;
import com.fastcampus.java.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
