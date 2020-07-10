package com.epam.traits;

/**
 * @author Evgeny Borisov
 */
public class Human implements Killer{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void killAll()
    {
        System.out.println("стреляет снайпер по номером "+id());
        System.out.println("все убиты");
    }

    @Override
    public int resurrect()
    {
        return 0;
    }


    @Override
    public int id()
    {
        return 0;
    }

    @Override
    public String name()
    {
        return "Name";
    }
}
