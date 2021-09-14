/*
    UCF COP3330 Fall 2021 Assignment 1 Solution
    Copyright 2021 Isabelle Kenny
 */

package com.challenge;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Challenge {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = userInput.nextLine();
        JOptionPane.showMessageDialog(null, "Hello, " + userName + ", nice to meet you!");

    }
}