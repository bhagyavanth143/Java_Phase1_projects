package com.practiceproject.calculator;

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	
	// stores two numbers
	 double num1, num2;
	
	 // Take input from the user
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the numbers");
	 
	// take the inputs
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	 
	 System.out.println("Enter the operator (+,-,*,/)");
	 char operator = sc.next().charAt(0);
	 
	 double result = 0;
	 
	 switch (operator) {
	 
	 // case to add two numbers
	 case '+':
	 result = num1 + num2;
	 break;
	 
	 // case to subtract two numbers
	 case '-':
	 result = num1 - num2;
	 break;
	 
	 // case to multiply two numbers
	 case '*':
	 result = num1 * num2;
	 break;
	 
	 // case to divide two numbers
	 case '/':
	 result = num1 / num2;
	 break;
	 
	 default:
	 
	 System.out.println("choose valid option");
	 
	 break;
	 }
	 
	 System.out.println("The final result:");
	 
	 System.out.println();
	 
	 // print the final result
	 System.out.println(num1 + " " + operator + " " + num2
	 + " = " + result);
	 }
}