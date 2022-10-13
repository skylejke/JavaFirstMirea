package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class Task8_3 {
    public static void main(String[] args) {
        String path="C:/Users/danil/IdeaProjects/JavaFirstMirea/src/ru/mirea/task8/nixDance.gif";
        JFrame frame = new JFrame("Task8_3");
        JLabel label =new JLabel();


        Image image = Toolkit.getDefaultToolkit().createImage(path);
        ImageIcon imageIcon= new ImageIcon(image);
        imageIcon.setImageObserver(label);
        label.setIcon(imageIcon);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


