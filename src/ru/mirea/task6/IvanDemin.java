package ru.mirea.task6;

public class IvanDemin implements Nameable {

    @Override
    public String getName() {
        return "Hello, my name is Ivan Demin!";
    }

    public static void main(String[] args) {
        IvanDemin vanya=new IvanDemin();
        System.out.print(vanya.getName());
    }

}
