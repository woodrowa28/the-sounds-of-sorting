package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;
import edu.grinnell.csc207.soundsofsorting.sortevents.*;

public class SortsTests {
    /**
     * @param <T> the carrier type of the array
     * @param arr the array to check
     * @return true if <code>arr</code> is sorted.
     */
    public static <T extends Comparable<? super T>> boolean sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
    
    public static <T extends Comparable<? super T>> void eventSort(
            T[] originalArr, List<SortEvent<T>> l) {
        for(SortEvent<T> event : l) {
            event.apply(originalArr);
        }
    }

    public static Integer[] makeGenArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }
    
    public static Integer[] makeSortedArray() {
        return new Integer[] {
            1, 2, 3, 4, 5, 6, 7, 8,
            9, 10, 11, 12, 13, 14, 15
        };
    }
    
    public static Integer[] makeBackwardsArray() {
        return new Integer[] {
            14, 13, 12, 11, 10, 9,
            8, 7, 6, 5, 4, 3, 2, 1
        };
    }
    
    public static Integer[] makeLongArray() {
        Integer[] arr = new Integer[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        return arr;
    }
    
    public static Integer[] makeAlmostSortedArray() {
        return new Integer[] {
            15, 1, 2, 3, 4, 5, 6, 7,
            8, 9, 10, 11, 12, 13, 14
        };
    }

    public void testSort(Function<Integer[], List<SortEvent<Integer>>> func, Integer[] arr) {
        Integer[] arrApply = Arrays.copyOf(arr, arr.length);
        List<SortEvent<Integer>> events = func.apply(arr);
        assertTrue(sorted(arr));
        eventSort(arrApply, events);
        assertTrue(sorted(arrApply));
    }
    
    public void generalTests(Function<Integer[], List<SortEvent<Integer>>> func) {
        testSort(func, makeSortedArray());
        testSort(func, makeGenArray());
        testSort(func, makeBackwardsArray());
        testSort(func, makeLongArray());
        testSort(func, makeAlmostSortedArray());
    }

    @Test
    public void testBubbleSort() {
        generalTests(Sorts::bubbleSort);
    }
    
    @Test
    public void testInsertionSort() {
        generalTests(Sorts::insertionSort);
    }
    
    @Test
    public void testSelectionSort() {
        generalTests(Sorts::selectionSort);
    }

    @Test
    public void testMergeSort() {
        generalTests(Sorts::mergeSort);
        Integer[] edgeMergesArr = new Integer[] {
            2, 6, 9, 10, 21, 71, 13, 7, 9, 1
        };
        testSort(Sorts::mergeSort, edgeMergesArr);
    }
    
    @Test
    public void testQuickSort() {
        generalTests(Sorts::quickSort);
        Integer[] edgePartitionsArr = new Integer[] {
            5, 9, 6, 10, 45, 13, 19, 2, 7
        };
        testSort(Sorts::quickSort, edgePartitionsArr);
    }
    
    @Test
    public void testGnomeSort() {
        generalTests(Sorts::gnomeSort);
    }
}