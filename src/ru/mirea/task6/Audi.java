package ru.mirea.task6;

public class Audi implements Nameable, Priceable{

    @Override
    public String getName() {
        return "I am Audi brand car";
    }

    @Override
    public String getPrice() {
        return "My price starts from 50000$";
    }

    public static void main(String[] args) {
        Audi audi=new Audi();
        System.out.print(audi.getName()+"\n"+audi.getPrice());
    }

}
