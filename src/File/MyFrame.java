package File;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
public class MyFrame extends javax.swing.JFrame {
    MyFrame (){
        this.setTitle("JFrame titles goes here");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420); // this set x - dimension and y- dimension
        this.setVisible(true); // this will make the frame visible
        ImageIcon image = new ImageIcon("C:\\Users\\HP.COM\\IdeaProjects\\Engr_horshy\\src\\File\\logo.jpg");// create an imageicon
        this.setIconImage(image.getImage());// change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250)); // set background color to green

    }
}
