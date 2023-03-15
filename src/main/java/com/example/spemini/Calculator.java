package com.example.spemini;

import java.util.*;
/**
 * Hello world!
 */
/*class mathmethods
{
    public mathmethods()
    {

    }

    public int factorial(int num)
    {
        int result = 1;
        for (int i = 1;i < num+1;i++)
        {
            result = result * i;
        }

        return result;
    }
}*/


public class Calculator
{
    public Calculator() 
    {

    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    
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
            System.out.println("-----------------------------------");
            System.out.println("Welcome to calculator program ...!");
            System.out.println("Please select operation to continue");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm (base e)");
            System.out.println("4. Power ");
            System.out.println("5. Exit");
            System.out.print("Enter operation number: ");
            System.out.println("-----------------------------------");
            
            int num_operation = 0;
            num_operation = sc.nextInt();
            
            if (num_operation == 1)
            {

            }

            else if (num_operation == 2)
            {

            }
            
            else if(num_operation == 3)
            {
                int num;
                num = sc.nextInt();
                //int result = obj.factorial(num);
                int result = factorial(num);
                System.out.println(result);
            }

            else if(num_operation == 4)
            {

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
