package javaapplication197;


enum Day{
MON(1,"monday"),
TUE(2,"tuesday"),
WED(3, "wednesday"),
THI(4, "thirsday"),
FRI(5, "friday"),
SAT(6, "saturday"),
SUN(7, "sunday");

    private int number;
    
    public int getNumber(){
    return number;
    }
    String name;

    private Day(int number, String name){
    this.number = number;
    this.name = name;
    }

}

public class JavaApplication197 {

    public static void main(String[] args) {
       
        Day[] days = Day.values();
        
        for(Day d: days)
            System.out.println(d.name);
    }

}
