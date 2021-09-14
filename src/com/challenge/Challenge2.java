package com.challenge;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = userInput.nextLine();
        String cool = "Isabelle";
        if(userName.equalsIgnoreCase(cool)){
            System.out.println("Yay, this is Isabelle!");
        }
        else{
            System.out.println("Ew, this is not Isabelle!");
            System.out.println(userName);
        }

    }

}
