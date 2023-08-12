package temperature_converter_task;

import java.util.*;
public class Source_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        
        int result = sc.nextInt();

        if (result == 1) {
            // Fahrenheit to Celsius
            System.out.println("You have chosen Fahrenheit to Celsius!");
            System.out.println("Enter the Fahrenheit value: ");
            double value = sc.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.println("Celsius is: " + Math.round(valueFinal * 10.0) / 10.0);
        } else if (result == 2) {
            // Celsius to Fahrenheit
            System.out.println("You have chosen Celsius to Fahrenheit!");
            System.out.println("Enter the Celsius value: ");
            double value = sc.nextDouble();
            double finalResult = value * 1.8 + 32;
            System.out.println("Fahrenheit is: " + Math.round(finalResult * 10.0) / 10.0);
        } else {
            System.out.println("Not a valid choice. Please enter 1 or 2.");
        }
        sc.close();
    }

	}


