package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a и число b");
        System.out.print("Первое число=");
        double number1 = in.nextDouble();
        System.out.print("Второе число=");
        double number2 = in.nextDouble ();
        double result = 0;

        System.out.println ("Введите операцию");


          String operation = in.next();
              switch (operation)
              {
                  case "+":
                       System.out.println (number1+number2);
                        break;
                  case "-":
                      System.out.println (number1-number2);
                      break;
                  case "*":
                      System.out.println (number1*number2);
                      break;
                  case "/":
                      System.out.println (number1+number2);
                      break;
              }

        }

    }



