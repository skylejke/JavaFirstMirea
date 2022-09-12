package ru.mirea.task4;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Ball ball=new Ball();
        double x, y, x1, y1;
        System.out.print("Введите начальные координаты мяча\nx: ");
        x=scanner.nextDouble();
        System.out.print("y: ");
        y=scanner.nextDouble();
        ball.setXY(x, y);
        System.out.println(ball.toString());
        System.out.print("Введите координаты, на которые должен сдвинуться мяч\nx: ");
        x1=scanner.nextDouble();
        System.out.print("y: ");
        y1=scanner.nextDouble();
        ball.move(x1, y1);
        System.out.print(ball.toString());
    }
}
