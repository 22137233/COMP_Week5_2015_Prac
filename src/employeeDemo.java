import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create an Employee object using the no-arg constructor
        Employee accountant = new Employee();

        // Display accountant details with descriptive labels
        System.out.println("\nAccountant Details:");
        System.out.println("Employee ID: " + accountant.getEmployeeId());
        System.out.println("First Name: " + accountant.getFirstName());
        System.out.println("Last Name: " + accountant.getLastName());
        System.out.println("Address: " + accountant.getAddress());
        System.out.println("Annual Leave (hours): " + accountant.getAnnualLeavHour());
        System.out.println("Long Service Leave (hours): " + accountant.getLongServiceLeaveHours());

        // Obtain user input with error handling
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter New Employee Details:");

        int staffID = getInputInt(scanner, "Staff ID: ");
        String firstName = getInputString(scanner, "First Name: ");
        String lastName = getInputString(scanner, "Last Name: ");
        String address = getInputString(scanner, "Address: ");

        int getEmployeeId;
		String getFirstName;
		String getLastN;
		// Create a new Employee object with arguments
        Employee newEmployee = new Employee();

//         Display  
        System.out.println("Employee ID: " + newEmployee.getEmployeeId());
        System.out.println("First Name: " + newEmployee.getFirstName());
        System.out.println("Last Name: " + newEmployee.getLastName());
        System.out.println("Address: " + newEmployee.getAddress());

        // Assume new employee accrues 40 hours of annual leave
        newEmployee.setAnnualLeaveHours1(40.0);
        System.out.println("\nAfter Accruing 40 Hours of Annual Leave:");
        System.out.println("Annual Leave (hours): " + newEmployee.getAnnualLeavHour());

        // Request leave with error handling
        System.out.println("\nEnter Leave Request:");
        char leaveType = getLeaveTypeInput(scanner);
        int daysRequested = getInputInt(scanner, "Enter number of days requested: ");
        double hoursRequested = daysRequested * 8.0;

        // Check if leave can be taken
        boolean leaveApproved = newEmployee.requestLeave(leaveType, hoursRequested);

        if (leaveApproved) {
            System.out.println("\nLeave approved.");
        } else {
            System.out.println("\nLeave denied. Insufficient leave hours available.");
        }

        // Display employee details after leave request
        System.out.println("\nEmployee Details After Leave Request:");
        System.out.println("Annual Leave (hours): " + newEmployee.getAnnualLeavHour());
        System.out.println("Long Service Leave (hours): " + newEmployee.getLongServiceLeaveHours());

        scanner.close();
    }

    private static int getInputInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Clear invalid input
                System.out.println("Invalid input. Please enter an integer value.");
            }
        }
    }

    private static String getInputString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static char getLeaveTypeInput(Scanner scanner) {
        while (true) {
            System.out.print("Enter type of leave (A = Annual, L = Long Service): ");
            String input = scanner.nextLine().toUpperCase();
            if (input.length() == 1 && (input.charAt(0) == 'A' || input.charAt(0) == 'L')) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid leave type. Please enter 'A' or 'L'.");
            }
        }
    }
}