import java.util.Scanner;

public class InvoiceTest{
    public static void main(String [] args){

       // Scanner input = new Scanner(System.in);

       // System.out.print("Enter Amount: ");

       Invoice detail = new Invoice("xpe102", "Ac cooler", 20, 20.45);
       Invoice gen = new Invoice("xpe102", "Ac cooler", -20, -20.45);

       System.out.println(detail.getInvoice());
       System.out.println(gen.getInvoice());
       System.out.println(detail.getPartNumber() + " " + detail.getDescription() + " " + detail.getPQuantity() + " " + detail.getPrice());
       System.out.println(gen.getPartNumber() + " " + gen.getDescription() + " " + gen.getPQuantity() + " " + gen.getPrice());
    }
}