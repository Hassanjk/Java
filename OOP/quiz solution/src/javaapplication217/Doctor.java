
package javaapplication217;


public class Doctor {
 public int id;
 public String name;
 public int numberOfPatients;
 
 public Patient[] patients;

    public Doctor(int id, String name, Patient[] patients) {
        this.id = id;
        this.name = name;
        this.patients = patients;
        numberOfPatients = this.patients.length;
    }
    
    
    
    public void printPatientsInfo(){
        for(Patient p : patients)
                System.out.println(p.info());
    }
}
