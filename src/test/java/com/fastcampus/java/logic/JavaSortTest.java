package com.fastcampus.java.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void javaSortTest() {
        // given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // when
        List<Integer> actual = javaSort.sort(List.of(1, 2, 4, 3, 5));

        // then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }

}