package id.its.pbo;

public class Employee {
	private String firstName;
    private String lastName;
    private double monthlySalary;
	// Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }
    // getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    // setter
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary(int percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * percentage / 100.0;
        }
    }
}
