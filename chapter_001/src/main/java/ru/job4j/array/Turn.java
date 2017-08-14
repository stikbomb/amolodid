package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Turn {
    public int[] back(int[] array){
        //для удобства введём переменную arLen
        int arLen = array.length - 1;
        //меняем числа из первой половины массива с числами из второй
        //при нечётном количестве чисел "среднее" число остаётся неизменным
        for (int i = 0; i <= (arLen / 2); i++){
            //для переназначения используем дополнительную переменную temp
            int temp = array[i];
            array[i] = array[arLen - i];
            array[arLen - i] = temp;
        }
        return array;
    }
}