package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top;
    private int left;
    private int widht = 0;
    private int height = 0;

    public void initialize(int top, int left, int widht, int height)
    {
        this.top = top;
        this.left = left;
        this.widht = widht;
        this.height = height;
    }
    public void initialize(int top, int left)
    {
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int widht)
    {
        this.top = top;
        this.left = left;
        this.widht = widht;
        this.height = widht;
    }

    public void initialize(Rectangle rectangle)
    {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.widht = rectangle.widht;
        this.height = rectangle.height;
    }

}
