  import java.util.Scanner;


public class InputOperator{

    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
     
        System.out.print("Input first interger: ");
        double num1 = input.nextDouble();

        System.out.print("Input second interger: ");
        double num2 = input.nextDouble();

        System.out.print("Input an operator '+ * - / % ^': ");
        char operator = input.next().charAt(0);


            if(operator == '+'){
                System.out.print("You added " +num1 + " and " +num2 + " to give: "+ (num1 + num2));
            }
            else if(operator == '-'){
                System.out.print("You minus " +num1 + " from " +num2 + " to give: "+ (num1 - num2));
            }
            else if(operator == '*'){
                System.out.print("You multiply " +num1 + " with " +num2 + " to give: "+ (num1 * num2));
            }
            else if(operator == '/'){
                System.out.print("You divide " +num1 + " by " +num2 + " to give: "+ (num1 / num2));
            }
            else if(operator == '%'){
                System.out.print("The modulus of " +num1 + " and " +num2 + " is: "+ (num1 % num2));
            }
            else if(operator == '^'){

                double firstNumber = num1;
                double secondNumber = num2;
                double c = 1;
                for (int i = 0; i < secondNumber; i++){
                    c = c * firstNumber;
                }

                System.out.print("The power of num1 to num2: "  + c);
            }
            else{
                System.out.print("No output for the operant inputed; Please input one of: + - * % ^");
            }input.close();
                    
    }
}