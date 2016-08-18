package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "8";

        for (int y = 0; y < 10; y++)
        {

            System.out.print(s);
        }

        System.out.println();


        for (int y = 0; y < 10; y++)
        {

            System.out.println(s);
        }

    }
}
