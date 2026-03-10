package Practice_OOPS;

public class ThisUsage {

		int empid;
		String empName;
		double empSalary;
		ThisUsage(int empid, String empName, double empSalary){
			this.empid = empid;
			this.empName = empName;
			this.empSalary = empSalary;
			System.out.println("Employee record created successfully");
		}
		ThisUsage(){
			this(101,"Default Employee",30000);
			System.out.println("Default Constructor called");
		}
		void registerEmployee() {
			System.out.println("Registering Employee..");
			this.displayDetails();
		}
		void displayDetails() {
			System.out.println("Employee ID : "+empid);
			System.out.println("Employee Name : "+empName);
			System.out.println("Employee Salary : "+empSalary);
		}
		void sendForProcessing() {
			HRDepartment hr = new HRDepartment();
			hr.processEmployee(this);
		}
		ThisUsage updateSalary(double hikePercentage) {
			this.empSalary=empSalary+(empSalary*hikePercentage/100);
			return this;
		}
		ThisUsage updateName(String newName) {
			this.empName = newName;
			return this;
		}
		public static void main(String[]args) {
			ThisUsage e= new ThisUsage();
			e.registerEmployee();
			
			e.sendForProcessing();
			
			System.out.println("--Updating Employee Details---");
			e.updateName("Subham").updateSalary(15.5).displayDetails();
			
			e.sendForProcessing();
		}

}
class HRDepartment{
	void processEmployee(ThisUsage e) {
		System.out.println("HR Department Processing Employee..");
		System.out.println("Processed Employee:"+e.empName +"with Salary"+ e.empSalary+"\n");
	}
	
			
		}
	
	
		
		
