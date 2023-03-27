package com.example.spemini;
import com.example.spemini.Calculator;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator
{
    private final static Logger logr = LogManager.getLogger(Calculator.class);
    // Hello, just adding for a demo ...
     // Hello, just adding for a demo ...
   
    public Calculator() 
    {

    }
    
    public static int factorial(int num)
    {
        logr.info("[Find the FACTORIAL of ] - " + num);
        if (num < 0)
        {
            logr.error("[The FACTORIAL of negative number can not be defined] " );
            return -1;
        }
        int result = 1;
        for (int i = 1;i < num+1;i++)
        {
            result = result * i;
        }
        logr.info("[The FACTORIAL of ] - " + num + " is " + result);
        return result;
    }

    public static double SquareRoot(double num)
    {
        logr.info("[Find the squareroot of ] - " + num);
        double result = Math.sqrt(num);
        logr.info("[The sqaureroot of ] - " + num + " is " + result);
        return result;
    }

    public static double naturalLogarithm(double num)
    {
        logr.info("[Find the naturallogarithm of ] - " + num);
        double result = Math.log(num);
        logr.info("[The naturallogarithm of ] - " + num + " is " + result);
        return result;
    }

    public static double power(double base, double exponent)
    {
        logr.info("[Find the ] - " + base + " raised " + exponent);
        double result = Math.pow(base, exponent);
        logr.info("[The base raised to exponent ] - " + " is " + result);
        return result;
    }


    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("Welcome to calculator program ...!");
            System.out.println("Please select operation to continue");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm (base e)");
            System.out.println("4. Power ");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Enter operation number: ");
            
            int num_operation = 0;
            num_operation = sc.nextInt();
            
            if (num_operation == 1)
            {
                System.out.println("");
                System.out.println("Square root of a number .....!");
                double num;
                System.out.print("Please enter the number: ");
                num = sc.nextDouble();
                double result = SquareRoot(num);
                System.out.print("The square root  of given number is ");
                System.out.print(result);
                System.out.print(" .");
            
            }

            else if (num_operation == 2)
            {
                System.out.println("");
                System.out.println("Factorial of a number .....!");
                int num;
                System.out.print("Please enter the number: ");
                num = sc.nextInt();
                int result = factorial(num);
                System.out.print("The factorial of given number is ");
                System.out.print(result);
                System.out.print(" .");
            }
            
            else if(num_operation == 3)
            {
                System.out.println("");
                System.out.println("Natural logarithm of a number .....!");
                double num;
                System.out.print("Please enter the number: ");
                num = sc.nextDouble();
                if (num < 0)
                {
                    System.out.println("Please enter a positive number ... ");
                    
                }
                double result = naturalLogarithm(num);
                System.out.print("The natural logarithm of given number is ");
                System.out.print(result);
                System.out.print(" .");
            }

            else if(num_operation == 4)
            {
                System.out.println("");
                System.out.println("Power of a number .....!");
                double base;
                double exponent;
                System.out.print("Please enter the base: ");
                base = sc.nextDouble();
                System.out.print("Please enter the exponent: ");
                exponent = sc.nextDouble();
                double result = power(base, exponent);
                System.out.print("The result is given by ");
                System.out.print(result);
                System.out.print(" .");
            }

            else if(num_operation == 5)
            {
                break;
            }

            else
            {
                System.out.println("Please enter valid number ...");
            }
        }

    }
}
