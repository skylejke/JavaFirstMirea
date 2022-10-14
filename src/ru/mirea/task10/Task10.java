package ru.mirea.task10;

import java.util.Scanner;

public class Task10 {

    public static int InputMenu(){
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВАРИАНТ №6\nВведите номер задания:\n1) Проверка числа на простоту.\n2) Разложение на множители.\n3) Палиндром.\n4) Без двух нулей.\n5) Разворот числа.\n0) Выход из программы");
        while(true){
            System.out.print("Введите число от 0 до 5: ");
            if (scanner.hasNextInt()){
                menu=scanner.nextInt();
                if (menu>=0 && menu<6){
                    return menu;
                }
                else {
                    System.out.println("Число вне допустимого диапазона значений. Повторите ввод.");
                    scanner.next();
                }
            }
            else {
                System.out.println("Неверный ввод, повторите.");
                scanner.next();
            }
        }
    }

    public static int InputInt() {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите натуральное число: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите натуральное число! ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0 );
        return n;
    }

    static boolean simple(int digit) {
        if (digit == 1) {
            return true;
        }
        return simple(digit, digit - 1);
    }

    public static boolean simple(int digit, int div) {
        if (div == 1) {
            return true;
        }
        if (digit % div == 0) {
            return false;
        } else {
            return simple(digit, div - 1);
        }
    }

    public static void main(String[] args) {
        int menu=-1;
        while (true) {
            menu=InputMenu();
            if (menu==0){
                System.out.println("Задание не выбрано\nВыход из программы...");
                break;
            }
            switch (menu) {
                case 1: {
                    int number;
                    System.out.println("Введите число, которое хотите проверить на простоту");
                    number = InputInt();
                    if (simple(number)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                }
                case 2:{

                    break;
                }
                case 3:{

                    break;
                }
                case 4:{

                    break;
                }
                case 5:{

                    break;
                }
                default:{
                    System.out.println("Задание не выбрано");
                    break;
                }
            }
        }
    }
}
