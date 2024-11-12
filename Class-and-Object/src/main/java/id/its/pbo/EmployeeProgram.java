package id.its.pbo;

public class EmployeeProgram {

	public static void main(String[] args) {
        Employee emp1 = new Employee("Alif", "Michel", 3000.0);
        Employee emp2 = new Employee("Aidin", "Ferarizta", 3500.0);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " - Gaji Tahunan: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " - Gaji Tahunan: $" + emp2.getYearlySalary());

        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " - Gaji Tahunan Setelah Kenaikan: $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " - Gaji Tahunan Setelah Kenaikan: $" + emp2.getYearlySalary());
	}

}
