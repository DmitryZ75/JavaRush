package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] ary = new int[10];
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        for (int i = 0; i < ary.length; i++)
        {
            ary[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < ary.length /2 ; i++)
        {
            int temp = ary[i];
            ary[i] = ary[ary.length - 1 - i];
            ary[ary.length - 1 - i] = temp;
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(ary[i]);
        }
    }
}
