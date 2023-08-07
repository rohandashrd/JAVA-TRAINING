import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class employee {

    public static int calculateAge(LocalDate dateOfBirth, LocalDate currentDate) {
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public static double calculatesalary(double basicsalary){
        double da = 0.02 * basicsalary;
        double ta = 0.01 * basicsalary;
        double hra = 0.03 * basicsalary;
        double pf = 0.5 * basicsalary;

        double grossSalary = (basicsalary + da + ta + hra )- pf;
        System.out.println("before pf: "+(basicsalary + da + ta + hra));
        System.out.println("after pf: "+grossSalary);

        if (grossSalary > 10000) {
            grossSalary -= 1000;
        }

        return grossSalary;

    }

    public static int calculateRetirementYear(LocalDate currentDate, int yearsLeftForRetirement) {
        return currentDate.getYear() + yearsLeftForRetirement;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("----------Welcome "+name+"!!!----------");

        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        String birthdate =sc.next();

        //for parsing user date input as string to local date format
        LocalDate dateOfBirth = LocalDate.parse(birthdate);

        //calculate current date
        LocalDate currentDate = LocalDate.now();

        int age =calculateAge(dateOfBirth,currentDate );
        System.out.println("Your age is: "+age);

        if(age>=18){
            System.out.print("Enter your basic salary: ");
            double basicsalary=sc.nextDouble();

            if (basicsalary < 4500 || basicsalary > 6500) {
                System.out.println("Invalid input. Basic payment should be between 4500 and 6500.");
                return;
            }

            double grossSalary = calculatesalary(basicsalary);

            System.out.println(" Your gross salary: " + grossSalary);

            int retirementAge = 55;
            int yearsLeftForRetirement = retirementAge - age;
            int retirementYear = calculateRetirementYear(currentDate, yearsLeftForRetirement);

            if (yearsLeftForRetirement > 0) {
                System.out.println("Retirement in " + yearsLeftForRetirement + " years, in the year " + retirementYear);
            } else {
                System.out.println("Employee is already retired or will retire this year.");
            }
        } else {
            System.out.println("Employee's age should be greater than or equal to 18 to calculate salary and retirement year.");
        }
        }







    }

