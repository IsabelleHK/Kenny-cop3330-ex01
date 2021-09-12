/*
    UCF COP3330 Fall 2021 Assignment 1 Solution
    Copyright 2021 Isabelle Kenny
 */

package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String userName = userInput.nextLine();
        JOptionPane.showMessageDialog(null, "Hello, " + userName + ", nice to meet you!");
    }
}
