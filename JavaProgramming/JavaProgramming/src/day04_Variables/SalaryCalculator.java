package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // Hourly Rate,weekly Hours

        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberofweeks =52;

        int salary =hourlyRate * weeklyHours * numberofweeks;
        //System.out.println("salary");
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours =" + weeklyHours);
        System.out.println("salary = $" + salary);
        



    }
}
