package ru.mirea.task6;

public class Iphone implements Nameable, Priceable{

    @Override
    public String getName() {
        return "I am Iphone, Apple brand phone";
    }

    @Override
    public String getPrice() {
        return "My price is 1000$";
    }

    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        System.out.print(iphone.getName()+"\n"+iphone.getPrice());
    }

}
