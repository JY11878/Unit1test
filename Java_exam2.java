/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_exam2;
import java.util.Scanner;

/**
 *
 * @author Augustus
 */
public class Java_exam2 {

    public static void main(String[] args) {
        
    Scanner typing = new Scanner(System.in);
     Double num1;
     Double num2;
         System.out.println("Typing 1st value");
     num1 = typing.nextDouble();
         System.out.println("Typing 2nd value");
     num2 = typing.nextDouble();
     char cal = 'A';
      switch (cal)
      {
         case 'A' :
            System.out.println("num1 + num2"); 
            break;
         case 'B' :
            System.out.println("num1 - num2");
            break;
         case 'C' :
            System.out.println("num1 * num2");
            break;
         case 'D' :
            System.out.println("num1 / num2");
            break;
      }
      System.out.println("The result is " + cal);
    }
}
