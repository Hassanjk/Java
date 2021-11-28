
package rockscissorpapergamev1;

import java.util.Random;
import java.util.Scanner;

enum HandSign{
    ROCK,
    SCISSOR,
    PAPER
}
public class Player{
    
    String name;
    HandSign sign;
    int wins;
    static int draws;
    static int trials;
    

    Player(String name) { 
      this.name = name;
    }

    void move() {
        if (Game.isOver) return;
        char userChoice;
        boolean isInputValid=true;
        Scanner input = new Scanner(System.in);
        System.out.println(name +" your turn");
        do{
              System.out.println("enter q for quit, p for paper, r for rock, s for scissor");
           userChoice = input.next().charAt(0);
           
           switch(userChoice){
               case 'q':
                   Game.isOver=true;
                   break;
               case 'r':
                   sign = HandSign.ROCK;
                   System.out.println(sign);
                   break;
               case 'p':
                   sign = HandSign.PAPER;
                   System.out.println(sign);
                   break;
               case 's':
                   sign = HandSign.SCISSOR;
                   System.out.println(sign);
                   break;
               default:
                   isInputValid =false;
                   System.out.println("invalid input");
                   break;
           }
            
        
        }while(!isInputValid);
    }
    
    
    void autoMove(){
        Random rand = new Random();
       int choice =  rand.nextInt(3); //stores either 0,1, or 2.
        if (choice==0) {
            sign = HandSign.PAPER;
        }
        else if(choice ==1){
            sign = HandSign.ROCK;
        }
        else if(choice ==2){
            sign = HandSign.SCISSOR;
        }
        
       // System.out.println(this.name +" " + sign);
    }
      
}
