
package duel;
public class Duelist {
    public static void main(String[] args) {
        
        Character player = new Character("Revan");
        Bot opponent = new Bot("Vader",0);
        boolean duel=true;
        int i=0;
        while(duel){
        
        i++;
        System.out.println("Phase "+i+": a-atack, d-defence");
        
        int p=Fight.phase(player.getName(),true);
        int o=Fight.phase(opponent.getName(),false);
        if(o==3 && p!=4){player.damage(10);
        System.out.println(player.name+"'s health="+player.health);
        }
        if(p==3 && o!=4){opponent.damage(10);
        System.out.println(opponent.name+"'s health="+opponent.health);
        }
        if(p==4&&o==3){boolean h=Fight.parry(player.name);
        if(h){opponent.damage(10);
        System.out.println(opponent.name+"'s health="+opponent.health);
        }
        }
        if(p==3&&o==4){boolean h=Fight.parry(opponent.name);
        if(h){player.damage(10);
        System.out.println(player.name+"'s health="+player.health);
        }
        }
        if(player.health<=0){
        System.out.println(player.name +"lost...");
            duel=false;
        }
         
        if(opponent.health<=0){
        System.out.println(player.name +"win!");
            duel=false;
        }
        }
    }
    
}
