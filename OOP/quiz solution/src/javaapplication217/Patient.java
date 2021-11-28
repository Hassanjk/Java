
package javaapplication217;


class Patient {
public int id;
public String problem;

    public Patient(int id, String problem) {
        this.id = id;
        this.problem = problem;
    }
    
    
    public String info(){
     return String.format("%d %s", this.id, this.problem);
     }


}
