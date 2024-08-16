/**
 * Week 5 practical code. Not to be used without permission and appropriate
 * referencing
 */

public class Employee {
  private int staffID;              // employee unique identifier
  private String firstName;
  private String surname;
  private String address;           // home address
  private double annualLeave;       // accrued annual leave available (hours)
  private double longServiceLeave;  // accrued long service leave available (hours)

  /**
   * @return staff Identification number
   */
  public int getStaffID() {
    return staffID;
  }


  /**
   * @param ID - The new employees staff identification number
   */
  public void setStaffID(int ID) {
    staffID = ID;
  }



  /**
   * Determines if the employee has sufficient accrued leave to cover the
   * requested number of hours of leave.
   *
   * @param leaveType
   *          – the type of leave requested. A = Annual, L = long service
   * @param requestedHours
   *          – the number of hours of leave requested by the employee
   * @return true if leave is approved, false otherwise
   */
  public boolean requestLeave(char leaveType, double requestedHours) {
    if (leaveType == 'A') {
      if (annualLeave > requestedHours) {
        return true;
      } else {
        return false;
      }
    } else {
      if (longServiceLeave > requestedHours) {
        return true;
      } else {
        return false;
      }
    }
  }
  
} // end Employee class
