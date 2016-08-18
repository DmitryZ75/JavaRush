package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name = null;
    private int weght;
    private int age;
    private String colour = null;
    private String address = null;

    public void initialize(String name)
    {
        this.name = name;
        this.weght = 7;
        this.age = 5;
    }

    public void initialize(String name, int weght, int age)
    {
        this.name = name;
        this.weght = weght;
        this.age = age;
    }
    public void initialize(int weght, String colour)
    {

        this.weght = weght;
        this.age = 5;
        this.colour = colour;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.weght = 7;
        this.age = age;
    }

    public void initialize(int weght, String colour, String address)
    {

        this.weght = weght;
        this.age = 5;
        this.colour = colour;
        this.address = address;
    }


}
