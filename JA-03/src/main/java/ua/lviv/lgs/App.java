package ua.lviv.lgs;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class App {

	private static Logger log = Logger.getLogger(App.class);

	public static void main(String[] args) throws wrongInputException {
		
		DOMConfigurator.configure("loggerConfig.xml");
        System.out.println("----------------------------------------------");
		System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
   
        int a = sc.nextInt();
        
        System.out.println("Enter second number");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        
        System.out.println("Enter +,-,* or /: ");
        Scanner sc3 = new Scanner(System.in);
        String action = sc3.next();
        
        
     switch (action) {
		case "+": {
			log.info("User adding two numbers: " + a + " and " + b);
			add(a,b);
			break;
		}
		
		case "-": {
			log.info("User substracting two numbers: " + a + " and " + b);
			substract(a, b);
			break;
		}
		
		case "*": {
			log.info("User mltiplying two numbers: " + a + " and " + b);
			multiply(a, b);
			break;
		}
		
		case "/": {
			if (a==0 || b==0) {
				log.warn("You cant devide by zero");
			}
			log.info("User deviding two numbers: " + a + " and " + b);
			devide(a,b);
		}
		
		default:
			break;
		}

	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void substract(int a, int b) {
		System.out.println(a - b);
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void devide(int a, int b) throws wrongInputException {

		try {

			if (a == 0 || b == 0) {
				throw new wrongInputException();
			} else
				System.out.println(a / b);
		} catch (wrongInputException e) {
			log.error("Error happened --> " + e);
		}

	}
}
