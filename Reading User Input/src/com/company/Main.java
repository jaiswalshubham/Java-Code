package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int yearOfBirth=scanner.nextInt();
        scanner.nextLine();//Handle Next Line Character

        System.out.println("Enter your Name: ");
        String name=scanner.nextLine();
        int age=2020-yearOfBirth;

        System.out.println("Your name is "+name+", and you are "+age+" years old.");
        scanner.close();
    }
}
