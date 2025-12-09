package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        int age = input.nextInt();

        int yearsLeft = 100 - age;

        System.out.println("You have " + yearsLeft + " years until you are 100 years old.");

        input.close();
    }
}