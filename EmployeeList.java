public class EmployeeList {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void EmployeeList(String[] args) {
    EmployeeList myObj = new EmployeeList();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
