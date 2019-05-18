// Assignment: write a progarm that takes input x and y and 
//a. find the yth root of x (y-/x).
//b. find p(x,y)
//Solution for b. ie. permutation of X,Y.
//Author: Emmanuel Akinbode.   ayoitunu@gmail.com
//Location: Semicolon, Lagos Nigeria.   www.semicolon.africa
//Date: 05/18/2019


import java.util.Scanner;

public class Permutation
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for X: ");
        int num1 = input.nextInt();

        System.out.print("Enter value for Y: ");
        int num2 = input.nextInt();
        int num3 = num1 - num2;

        int permut1 = num1;
        int permut2 = num3;
        int c;
        int d;

         for(int i = 1; i<num1; i++)
        {
            c = num1 - i;
            permut1*= c;
        
        } 
        for (int j = 1; j<num3; j++)
        {
            d = num3 - j;
            permut2*= d;

        }
         System.out.println();      
         System.out.println("Factorial for X is: " + num1 + "!" + " = " + permut1);
         System.out.println("Factorial for Y is: " + num2 + "!" + " = " + permut2);
         System.out.println();
         System.out.println("Permutation of X and Y =  X!/(X-Y)! ");
         System.out.println(" = " + num1 + "!" + "/" + (num1 - num2) + "!");
         System.out.println();
         System.out.println("The permutation of X and Y is: " + permut1/permut2);
         input.close();      
    }
    
}