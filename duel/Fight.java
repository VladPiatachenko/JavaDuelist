
package duel;

import java.util.Scanner;

public class Fight {
    
    public static int phase(String name, boolean player){
    char action;
    if(player){
        Scanner sc = new Scanner(System.in);   
        action = sc.next().charAt(0);}
    else{
        int t = 0 + (int) (Math.random() * 100); 
                if(t%2==0){      
                    action='a';
                }
                else{
                    action='d';}
        }
    int result=0;
    if(action=='a'){
        System.out.println(name+" atacks:");
        int atack = 0 + (int) (Math.random() * 100); 
        if(atack>50){
        System.out.println("...and hits!");
        result=3;
        }
        else{
        System.out.println("...and miss.");
        result=2;
        }
    }
    else if (action=='d'){
        System.out.println(name+" shilds up:");
        int defence = 0 + (int) (Math.random() * 100); 
        if(defence>50){
        System.out.println("...and succesfully!");
        result=4;
        }
        else{
        System.out.println("...but unsuccesfully.");
        result=2;
        }
    
    }
    
   return  result;
   }

    static boolean parry(String name) {
        int chance = 0 + (int) (Math.random() * 100); 
            if(chance<100-15){
            System.out.println(name+"parryed succesfully!");
            return true;
            }
            return false;
}
}
