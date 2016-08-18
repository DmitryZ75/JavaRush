package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] massive = new int[5];
        for (int i = 0; i < 5; i++)
        {
            massive[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++){
            for (int j = i; j < 5; j++)
            {   
                if (massive[i]>massive[j]){
                    int temp = massive[i];
                    massive[i] = massive[j];
                    massive[j] = temp;
                }

            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(massive[i]);
        }

    }
}
