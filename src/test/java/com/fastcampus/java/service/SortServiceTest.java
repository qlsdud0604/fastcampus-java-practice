package com.fastcampus.java.service;

import com.fastcampus.java.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sortService = new SortService(new JavaSort<String>());

    @Test
    void sortServiceTest() {
        // given

        // when
        List<String> actual = sortService.doSort(List.of("2", "3", "1", "5", "4"));

        // then
        assertEquals(List.of("1", "2", "3", "4", "5"), actual);
    }

}