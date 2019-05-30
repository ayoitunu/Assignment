import java.util.Scanner;

public class HeartRates{
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    int maxRates;
    int age;

    public HeartRates(String firstName, String lastName, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getfirstName(){
        return firstName;
    } 
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getlastName(){
        return lastName;
    } 
    public void setyearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getyearOfBirth(){
        return yearOfBirth;
    } 
    public void setmonthOfBirth(int monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }
    public int getmonthOfBirth(){
        return monthOfBirth;
    }
    public void setdayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
    public int getdayOfBirth(){
        return dayOfBirth;
    } 
    public int calculateAge(){
        int age;
        age = 2019 - yearOfBirth;
        return age;
    }
    public int calMaxHeartRates(){
        
        int maxRates;   
        maxRates = 220 - age;
        return maxRates;
    }
    public String calTargetHeartrate(){
        
        double lowerPercent = 0.5 * maxRates;
        double highPercent = 0.85 * maxRates;
        String TargetHeartrate = lowerPercent + " and " + highPercent;

        return TargetHeartrate;

    }

}
class HeartRateTest{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter first year: ");
        int yearOfBirth = input.nextInt();

        System.out.print("Enter first month: ");
        int monthOfBirth = input.nextInt();

        System.out.print("Enter first day: ");
        int dayOfBirth = input.nextInt();

        HeartRates detail = new HeartRates("Tade", "Omo", 1980, 11, 25);

        System.out.println(detail.calculateAge());
        System.out.println(detail.calMaxHeartRates());
        System.out.println(detail.calTargetHeartrate());
        
    }
}

