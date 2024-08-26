public class Employee {
  private int getEmployeeId;
  private String firstName;
  private String getLastName;
  private String getAddress;
  private double getAnnualLeaveHours;
  private double getLongServiceLeaveHours;

  // Constructors
  public Employee() {
      this(-1, "Unknown", "Unknown", null, 0.0, 0.0);
  }

  public Employee(int getEmployeeId, String firstName, String getLastName, String getAddress,
                  double getAnnualLeaveHours, double getLongServiceLeaveHours) {
      this.getEmployeeId = getEmployeeId;
      this.firstName = firstName;
      this.getLastName = getLastName;
      this.getAddress = getAddress;
      this.getAnnualLeaveHours = getAnnualLeaveHours;
      this.getLongServiceLeaveHours = getLongServiceLeaveHours;
  }

  // Getters and Setters (omitted for brevity)

  // Methods
  public boolean canTakeLeave(LeaveType leaveType, double requestedHours) {
      if (requestedHours <= 0) {
          throw new IllegalArgumentException("Requested hours must be positive.");
      }

      switch (leaveType) {
          case ANNUAL:
              if (getAnnualLeaveHours >= requestedHours) {
                  getAnnualLeaveHours -= requestedHours;
                  return true;
              }
              break;
          case LONG_SERVICE:
              if (getLongServiceLeaveHours >= requestedHours) {
                  getLongServiceLeaveHours -= requestedHours;
                  return true;
              }
              break;
          default:
              throw new IllegalArgumentException("Invalid leave type.");
      }

      return false;
  }

  // Enum to represent leave types
  public enum LeaveType {
      ANNUAL,
      LONG_SERVICE
  }

  public String getFirstName() {
    return null;
  }

public String getEmployeeId() {
	// TODO Auto-generated method stub
	return null;
}

public String getLastName() {
	// TODO Auto-generated method stub
	return null;
}

public String getAddress() {
	// TODO Auto-generated method stub
	return null;
}

public String getAnnualLeavHour() {
	// TODO Auto-generated method stub
	return null;
}




public String getLongServiceLeaveHours1() {
	// TODO Auto-generated method stub
	return null;
}

public void setAnnualLeaveHours(double d) {
	// TODO Auto-generated method stub
	
}



public String getLongServiceLeaveHours() {
	// TODO Auto-generated method stub
	return null;
}



public void setAnnualLeaveHours1(double d) {
	// TODO Auto-generated method stub
	
}

public boolean requestLeave1(char leaveType, double hoursRequested) {
	// TODO Auto-generated method stub
	return false;
}

public boolean requestLeave(char leaveType, double hoursRequested) {
	// TODO Auto-generated method stub
	return false;
}
}