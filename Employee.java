package employeemap;

/**
 * Assignment#5 
 * The Employee class stores an employee's ID number and name.
 * @author olga.osinskaya
 */
public class Employee {

    private final String employeeID; // employee Identification Number
    private final String employeeName; // employee name

    /**
     * Constructor
     *
     * @param eID the employee Identification Number
     * @param eName the employee name
     */
    public Employee(String eID, String eName) {
        employeeID = eID;
        employeeName = eName;
    }

    public String getID() {
        return employeeID;
    }

    public String getName() {
        return employeeName;
    }

    /**
     * toString method
     *
     * @return A string containing the employee ID and Name.
     */
    @Override
    public String toString() {
        return "An employee's ID number: " + employeeID
                + "\tName: "
                + employeeName;
    }

    /**
     * hashCode method
     *
     * @return A hash code for this employee.
     */
    @Override
    public int hashCode() {
        return employeeID.hashCode();
    }

    /**
     * equals method
     *
     * @param obj Another object to compare this object to.
     * @return true if the two objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        // Make sure the other object is a Employee.
        if (obj == null || !(obj instanceof Employee)) {
            return false;
        } else {
            // Both are Employee: Get a reference to other
            // object as a Employee and check if their id
            // numbers are the same.      
            Employee tempEmployee = (Employee) obj;
            return employeeID.equalsIgnoreCase(tempEmployee.employeeID);
        }
    }
}
