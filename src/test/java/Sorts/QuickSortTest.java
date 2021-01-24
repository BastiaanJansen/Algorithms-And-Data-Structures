package Sorts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    SortAlgorithm algorithm;
    Integer[] array;
    Integer[] sorted;

    @BeforeEach
    void setUp() {
        this.algorithm = new QuickSort();
        this.array = new Integer[]{ 1, 5, 4, 6, 6, 8, 4, 3, 1 };
        this.sorted = new Integer[]{ 1, 1, 3, 4, 4, 5, 6, 6, 8 };
    }

    @AfterEach
    void tearDown() {
        this.algorithm = null;
        this.array = null;
        this.sorted = null;
    }

    @Test
    void sort() {
        assertArrayEquals(sorted, algorithm.sort(array));
    }

    @Test
    void sortEmptyArray() {
        assertArrayEquals(new Integer[] {}, algorithm.sort(new Integer[] {}));
    }

    @Test
    void sortOneElement() {
        assertArrayEquals(new Integer[] { 2 }, algorithm.sort(new Integer[] { 2 }));
    }
}