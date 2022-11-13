package ru.mirea.task14;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class Task14 {

    public static int InputMenu() {
        int menu;
        System.out.println("Получить информацию о планете");
        System.out.println("1 - Stack");
        System.out.println("2 - Queue");
        System.out.println("3 - Dequeue");
        System.out.println("4 - DoubleList");
        System.out.println("5 - Stack (с взаимодействием с пользователем)");
        System.out.println("0 - Выход");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число от 0 до 5: ");
            if (scanner.hasNextInt()) {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 8) {
                    return menu;
                } else {
                    System.out.println("Число вне допустимого диапазона значений. Повторите ввод.");
                }
            } else {
                System.out.println("Неверный ввод, повторите.");
                scanner.next();
            }
        }
    }

    static Player first = new Player("first");
    static Player second = new Player("second");
    static int turns = 0;

    public static void main(String[] args) {
        int menu = InputMenu();
        switch (menu) {
            case 1: {
                newGameStack();
                while (turns < 106) {
                    Card firstCard = first.toReveal();
                    Card secondCard = second.toReveal();
                    if (Card.compareCards(firstCard, secondCard)==1) {
                        first.addCard(firstCard, secondCard);
                    }
                    else {
                        second.addCard(secondCard, firstCard);
                    }
                    if (first.isEmpty()) {
                        System.out.println("second " + (turns+1));
                        break;
                    }
                    if (second.isEmpty()) {
                        System.out.println("first " + (turns+1));
                        break;
                    }
                    ++turns;
                }
                if (turns==106) {
                    System.out.println("botva");
                }
                break;
            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
            case 5: {
                newGameHardStack();
                while (turns < 106) {
                    Card firstCard = first.toReveal();
                    Card secondCard = second.toReveal();
                    if (Card.compareCards(firstCard, secondCard)==1) {
                        first.addCard(firstCard, secondCard);
                    }
                    else {
                        second.addCard(secondCard, firstCard);
                    }
                    if (first.isEmpty()) {
                        System.out.println("second " + (turns+1));
                        break;
                    }
                    if (second.isEmpty()) {
                        System.out.println("first " + (turns+1));
                        break;
                    }
                    ++turns;
                }
                if (turns==106) {
                    System.out.println("botva");
                }
            }
            default: {
                break;
            }
        }
    }

    static void newGameHardStack() {
        Scanner scanner = new Scanner(System.in);
        turns=0;
        first.clearHand();
        second.clearHand();
        System.out.println("Введите карты игроков (число от 0 до 9, карты не должны повторяться)");

        System.out.println("Введите карты первого игрока");
        for (int i = 0; i < 5; i++) {
            Card card = new Card(scanner.nextInt());
            first.addCard(card);
        }

        System.out.println("Введите карты второго игрока");
        for(int i = 0; i < 5; i++) {
            Card card = new Card(scanner.nextInt());
            second.addCard(card);
        }

        System.out.print("Первый игрок: ");
        System.out.println(first.toString());
        System.out.print("Второй игрок: ");
        System.out.println(second.toString());
        System.out.println("Игра началась");
    }

    static void newGameStack() {
        turns=0;
        first.clearHand();
        second.clearHand();
        Random rand = new Random();
        Stack<Card> cards = new Stack<>();
        for (int i=0; i<10; i++) {
            cards.add(new Card(i));
        }

        Player current = first;
        for (int i = 0; i < 10; i++) {
            Card card = cards.get(rand.nextInt(cards.size()));
            cards.remove(card);
            current.addCard(card);
            if (current==first) {
                current=second;
            }
            else {
                current=first;
            }
        }

        System.out.print("Первый игрок: ");
        System.out.println(first.toString());
        System.out.print("Второй игрок: ");
        System.out.println(second.toString());
        System.out.println("Игра началась");
    }

}

