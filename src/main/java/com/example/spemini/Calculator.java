package com.example.spemini;

import java.util.*;

public class Calculator
{
    public Calculator() 
    {

    }
    
    public static int factorial(int num)
    {
        int result = 1;
        for (int i = 1;i < num+1;i++)
        {
            result = result * i;
        }

        return result;
    }


    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        
        // mathmethods obj = new mathmethods();

        while(true)
        {
            System.out.println("");
            // System.out.println("");
            // System.out.println("");
            System.out.println("-----------------------------------");
            System.out.println("Welcome to calculator program ...!");
            System.out.println("Please select operation to continue");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm (base e)");
            System.out.println("4. Power ");
            System.out.println("5. Exit");
            System.out.println("");
            // System.out.println("");
            // System.out.println("");
            System.out.print("Enter operation number: ");
            // System.out.println("-----------------------------------");
            
            int num_operation = 0;
            num_operation = sc.nextInt();
            
            if (num_operation == 1)
            {
                System.out.println("");
                System.out.println("Square root of a number .....!");
                double num;
                System.out.print("Please enter the number: ");
                num = sc.nextDouble();
                double result = Math.sqrt(num);
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
                double result = Math.log(num);
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
                double result = Math.pow(base, exponent);
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
