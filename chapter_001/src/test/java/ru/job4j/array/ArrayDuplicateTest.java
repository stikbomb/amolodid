package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate newAD = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] resultArray = newAD.remove(array);
        String[] expectedArray = {"Привет", "Мир", "Супер"};
        assertThat(resultArray,is(expectedArray));
    }
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateHard() {
        //тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate newAD = new ArrayDuplicate();
        String[] array = {"Маша", "Ира", "Ира", "Ира", "Женя", "Женя", "Женя", "Жанна", "Маша","Маша", "Ира"};
        String[] resultArray = newAD.remove(array);
        String[] expectedArray = {"Маша", "Ира", "Женя", "Жанна"};
        assertThat(resultArray,is(expectedArray));
    }
}