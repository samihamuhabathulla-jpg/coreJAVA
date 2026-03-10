package Practice_OOPS;

public class Employee {
	String empId;
	String empName;
	void setDetails(String id, String name) {
		empId=id;
		empName = name;
	}
    void getDetails() {
		System.out.println("Employee ID:"+empId);
		System.out.println("EMployee Name:"+empName);
		}
	public static void main(String[]args) {
		Employee Emp1 = new Employee();
		Employee Emp2 = new Employee();
		
		Emp1.setDetails("1001","Ram");
		Emp2.setDetails("1002", "Raj");
		
		Emp1.getDetails();
		Emp2.getDetails();
	}
}
			
	


