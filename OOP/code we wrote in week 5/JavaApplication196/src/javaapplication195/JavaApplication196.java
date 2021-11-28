package javaapplication195;

public class JavaApplication196 {

    public static void main(String[] args) {
       
      TestEmp();  
    }
    
    static void TestEmp(){
        Employee emp1 = new Employee(23, "jane", 15);
        Employee emp2 = new Employee(45, "jack", 15);
        Employee emp3 = new Employee(90, "mike", 20);
        Employee[] employees = new Employee[]{emp1, emp2, emp3};
        
        Company comp  = new Company(employees);
        comp.printAllEmployeeInfo();
    }
}
