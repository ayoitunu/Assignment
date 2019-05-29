public class Account2{
    private String name;  //instance 
    private double balance;

    public Account2(String name, double balance){  //constructor name is class name
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void displayAccount( Account2 account1){

    }
}