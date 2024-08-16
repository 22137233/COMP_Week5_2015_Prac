import java.util.Scanner;

/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */

public class employeeDemo {
  public static void main(String[] args) {
    /*
     * This program demonstrates the use of the Employee class and some of its
     * methods to learn about the use of accessors and mutators
     */

    final double DAY_HOURS = 8.0;

    //create first employee object
    Employee accountant = new Employee();

    //display accountant object state immediately after creation
    System.out.println("\nWe just created the accountant object. Let's check the values of it's data fields.");
    System.out.println("\nInitial values for accountant object data fields:");
    System.out.println("Staff ID:\t\t\t" + accountant.getStaffID());
    System.out.println("First Name:\t\t\t" + accountant.getFirstName());
    System.out.println("Surname:\t\t\t" + accountant.getSurname());
    System.out.printf("Annual Leave:\t\t\t%.2f", accountant.getAnnualLeave());
    System.out.printf("\nLong Service Leave:\t\t%.2f" , accountant.getLongServiceLeave());
    System.out.println("\nHome Address:\t\t\t" + accountant.getAddress());

  }
}
