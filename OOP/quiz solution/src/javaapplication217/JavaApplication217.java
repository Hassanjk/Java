package javaapplication217;

public class JavaApplication217 {

    public static void main(String[] args) {
    
        Patient p1 = new Patient(0, "adsadasda");
        Patient p2 = new Patient(1, "adsdsdsadasda");
        
        Patient[] patients ={p1,p2};
        Doctor doctor = new Doctor(1, "dr oz", patients);
        doctor.printPatientsInfo();
        
    
    }

}
