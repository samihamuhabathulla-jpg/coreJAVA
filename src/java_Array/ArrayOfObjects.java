package java_Array;

public class ArrayOfObjects {

    String empId;
    String empName;

    void setDetails(String id, String name) {
        empId = id;
        empName = name;
    }

    void getDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String[] args) {

        ArrayOfObjects Emp1[] = new ArrayOfObjects[2];

        Emp1[0] = new ArrayOfObjects();
        Emp1[1] = new ArrayOfObjects();

        Emp1[0].setDetails("1001", "Ram");
        Emp1[1].setDetails("1002", "Raj");

        Emp1[0].getDetails();
        Emp1[1].getDetails();
    }
}