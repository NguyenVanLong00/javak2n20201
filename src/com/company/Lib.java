package com.company;

import java.math.BigInteger;
import java.util.*;

public class Lib {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * list commands
     */
    public static Command[] commands = {
            new Command("hw1","Find sum of first N number"),
            new Command("hw2","Check if number is Palindrome"),
            new Command("hw3","Check if numbers is prime"),
            new Command("hw4","Print written form of number"),
            new Command("hw5","Opp!, Nothing here"),
            new Command("hw6","Print all prime between 1 to N"),
            new Command("hw7","Find something from series number"),
            new Command("hw8","Calculate bytes"),
            new Command("quit","Stop program"),
    };

    public static void printCommands(){
        System.out.printf("\n\n%10s %60s \n", "COMMAND", "DESCRIPTION");
        for (Command c : Lib.commands) {
            System.out.printf("%10s %60s \n", c.name, c.description);
        }
        System.out.println("Type your command:");
    }


    /**
     * run command
     * @param command user command
     */
    public static void runCommand(String command){
        switch (command){
            case "quit":
                break;
            case "hw1":
                Lib.homework1();
                break;
            case "hw2":
                Lib.homework2();
                break;
            case "hw3":
                Lib.homework3();
                break;
            case "hw4":
                Lib.homework4();
                break;
            case "hw5":
                Lib.homework5();
                break;
            case "hw6":
                Lib.homework6();
                break;
            case "hw7":
                Lib.homework7();
                break;
            case "hw8":
                Lib.homework8();
                break;
        }
    }

    public static void homework1(){
        int n = Helper.getInputNumber();
        System.out.println("Sum sum of first "+ n +" odd number is " + Helper.sumOfOdd(n));
    }

    public static void homework2(){
        int n = Helper.getInputNumber();
        System.out.println(""+ n +" is " + (Helper.isPalindrome(n) ? " ":" not ") + "Palindrome number!");
    }

    public static void homework3(){
        int[] numbers = {3,4,2,5,123,12,6,32,634,7,42341};
        List<Boolean> results = Helper.isPrime(numbers);
        System.out.println("check with static array number");
        for (int i=0;i<numbers.length;i++){
            System.out.println("" + numbers[i] +" is " + (results.get(i)?"prime":"not prime"));
        }
    }

    public static void homework4(){
        int n = Helper.getInputNumber();
        System.out.println(Helper.getNumberString(n));
    }

    public static void homework5(){
        //TODO better do something with homework 5
    }

    public static void homework6(){
        int n = Helper.getInputNumber();

        for(Integer i: Helper.getPrimeLessThan(n)){
            System.out.println(i);
        }
    }

    public static void homework7(){
        Helper.printNumbersAttribute();
    }

    public static void homework8(){
        int n = Helper.getInputNumber();

        String calculatedByte = Helper.getCalculatedBytes(n);

        System.out.println(calculatedByte);

    }



}
