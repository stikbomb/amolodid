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

public class RotateArrayTest {

    /**
    Test added.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 2 на 2.
        RotateArray rotateArray = new RotateArray();
        int[][] array = {{1, 2}, {3, 4}};
        int[][] resultArray = rotateArray.rotate(array);
        int[][] expectArray = {{3, 1}, {4, 2}};
        assertThat(resultArray, is(expectArray));
    }

    /**
    Test added.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 3 на 3.
        RotateArray rotateArray = new RotateArray();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] resultArray = rotateArray.rotate(array);
        int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(resultArray, is(expectArray));
    }

    /**
    Test added.
     */
    @Test
    public void whenRotateFiveRowFiveColArrayThenRotatedArray() {
        //тест, проверяющий поворот массива размером 5 на 5.
        RotateArray rotateArray = new RotateArray();
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] resultArray = rotateArray.rotate(array);
        int[][] expectArray = {{21, 16, 11, 6, 1}, {22, 17, 12, 7, 2}, {23, 18, 13, 8, 3},
                {24, 19, 14, 9, 4}, {25, 20, 15, 10, 5}};
        assertThat(resultArray, is(expectArray));
    }
}