import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
         System.out.print("Enter number: ");
         int number = input.nextInt();

         if (number > 1 && number % 2 == 1 || number == 2){
             System.out.print("Number " + number + " inputed is a prime number");
         }else
         System.out.print("Number " + number + " inputed is not a prime number");


    }
}