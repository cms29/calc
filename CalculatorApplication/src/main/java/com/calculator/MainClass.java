package com.calculator;




	import java.util.Scanner;

	public class MainClass {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number");
			int firstNumber = scan.nextInt();

			System.out.println("Enter second number");
			int secondNumber = scan.nextInt();
			
	                //set the values in po
			Calculatorpojo calpo= new Calculatorpojo();
			calpo.setFirstNumber(firstNumber); 
			calpo.setSecondNumber(secondNumber);
			
			Calculation cal = new Calculation();
			
			int addResult = cal.add(calpo.getFirstNumber(), calpo.getSecondNumber());
			System.out.println("Addition Result ="+addResult);
			
			int subResult = cal.substract(calpo.getFirstNumber(), calpo.getSecondNumber());
			System.out.println("Subtraction Result ="+subResult);
			
			int mulResult = cal.multiply(calpo.getFirstNumber(), calpo.getSecondNumber());
			System.out.println("Multiplication Result ="+mulResult);
			
			float divResult = cal.divide(calpo.getFirstNumber(), calpo.getSecondNumber());
			System.out.println("Division Result ="+divResult);

		}

	}


