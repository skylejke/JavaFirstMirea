package ru.mirea.task4;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name, email;
        char gender;
        System.out.print("Введите имя автора: ");
        name=scanner.nextLine();
        System.out.print("Введите адрес электронной почты автора: ");
        email=scanner.nextLine();
        System.out.print("Введите пол автора: ");
        String s = scanner.next();
        gender = s.charAt(0);
        Author author=new Author(name, email, gender);
        System.out.print(author.toString());
    }
}
