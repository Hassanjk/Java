
package javaapplication195;


public class Company {
    private Employee[] employees;
    
    Company(Employee[] emps){
        this.employees = emps;
    }
    
    Employee[] getAllEmployees(){
        return employees;
    }
    
    void printAllEmployeeInfo(){
        for(Employee e : employees){
            System.out.println(e.getEmployeeInfo());
        }
    }
    
}
