
package javaapplication195;


class Employee {
    private int id;
    private String name;
    private double salary;
    private static String compName;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public String getEmployeeInfo(){
        String info = String.format("%d %s %f", this.id, this.name, this.salary);
        return info;
    }
    
    public static String getCompName(){
    return compName;
    }
    
    

 
}
