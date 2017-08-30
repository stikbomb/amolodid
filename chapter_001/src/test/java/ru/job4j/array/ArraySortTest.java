package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexander Molodid (a.molodid@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class ArraySortTest {

    /**
     Test added.
     */
    @Test
    public void whenOneSortedArrayPlusSecondSortedArrayThenResultArray() {
        ArraySort newAS = new ArraySort();
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int[] result = newAS.sort(a, b);
        int[] expect = {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expect));
    }

    /**
     Test added.
     */
    @Test
    public void whenOneSortedArrayPlusSecondSortedArrayThenResultArrayHard() {
        ArraySort newAS = new ArraySort();
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 8};
        int[] result = newAS.sort(a, b);
        int[] expect = {1, 2, 3, 5, 7, 8};
        assertThat(result, is(expect));
    }

    /**
     Test added.
     */
    @Test
    public void whenOneSortedArrayPlusSecondSortedArrayThenResultArrayHard2() {
        ArraySort newAS = new ArraySort();
        int[] a = {1, 2, 2, 3, 5, 7};
        int[] b = {2, 8};
        int[] result = newAS.sort(a, b);
        int[] expect = {1, 2, 2, 2, 3, 5, 7, 8};
        assertThat(result, is(expect));
    }

    /**
     Test added.
     */
    @Test
    public void whenOneSortedArrayPlusSecondSortedArrayThenResultArrayHard3() {
        ArraySort newAS = new ArraySort();
        int[] a = {1, 2, 2, 3, 5, 7};
        int[] b = {};
        int[] result = newAS.sort(a, b);
        int[] expect = {1, 2, 2, 3, 5, 7};
        assertThat(result, is(expect));
    }
}
