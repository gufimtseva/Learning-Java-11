import java.util.Scanner;

public class EmployeesSalaryCalculation {
    
    public static double salaryCalculator(double hoursPerWeek,
                                               double hourlyWage,
                                               int numberVacationDays) {
        
        if (hoursPerWeek < 0) {
            return -1;
        }

        if (hourlyWage < 0) {
            return -1;
        }

        if (numberVacationDays < 0) {
            return -1;
        }

        int workweeks = 52; // in 2023 year
        double hoursPerVacationDay = 8;
        
        // To calculate your annual income, you will...
        // multiply your hourly wage by the hours worked per week...
        // and then by the number of working weeks in a year
        double weeklyPaycheck = hoursPerWeek * hourlyWage;
        double unpaidTime = numberVacationDays * hoursPerVacationDay * hourlyWage;
        double yearlySalary = (weeklyPaycheck * workweeks) - unpaidTime;
                
        return yearlySalary;
    }

    public static void main(String[] args) {
        System.out.println("Put numbers of hours the employee works per week: ");
        Scanner inputHoursPerWeek = new Scanner(System.in);
        double hoursPerWeek = inputHoursPerWeek.nextDouble();

        System.out.println("Put amount of money the employee makes per hour: ");
        Scanner inputHourlyWage = new Scanner(System.in);
        double hourlyWage = inputHourlyWage.nextDouble();

        System.out.println("How many days the employee take as vacation days: ");
        Scanner inputNumberVacationDays = new Scanner(System.in);
        int numberVacationDays = inputNumberVacationDays.nextInt();

        // Print the employee's gross yearly salary
        double salary = salaryCalculator(hoursPerWeek, hourlyWage, numberVacationDays);
        
        if (salary >= 0){
            System.out.println("The employee's salary is " + salary);
        } else {
            System.out.println("You entered the wrong value. Let's try again.");
        }

    }
} 
