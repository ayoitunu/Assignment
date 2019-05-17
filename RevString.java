import java.util.Scanner;

public class RevString{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string value ");
        String value = input.nextLine();

        String reverse = "";
        for (int i = value.length()-1; i >= 0; i--)
        {
            reverse = reverse + (value.charAt(i));

        }
        System.out.print("Reverse string is: " + reverse);

    }

          
        
               

}