public class HealthProfile{
    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;
    private int height;
    private int weight; 

    public HeartRates(String firstName, String lastName, int year, int month, int day, int height, int weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
        this.height = height;
        this.weight = weight;
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
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    } 
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return weight;
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
    public class BMI(){
        bmi = weightInPounds*703/heightInInches * heightInInches
    }

}