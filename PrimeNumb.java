import java.util.Scanner;

public class PrimeNumb 
{
    private static boolean isPrime;
   

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        isPrime = true;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
            
        }
        if(isPrime)
        {
            System.out.println("Number " + num + " inputted is a Prime Number");

        }
        else
        {
            System.out.println("Number " + num + " inputted is not a prime");
        }
    }
}