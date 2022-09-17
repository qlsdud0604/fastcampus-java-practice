package com.fastcampus.java.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void bubbleSortTest() {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // when
        List<Integer> actual = bubbleSort.sort(List.of(1, 3, 4, 5, 2));

        // then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }

}