
package duel;


public class Character {
    String name;
    int health;
    int atack;
    int defence;
    int hitchance;
    int parry;
    int lvl;
    int exp;
    int duels;
    
    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.atack = 10;
        this.defence = 50;
        this.hitchance = 50;
        this.parry = 15;
        this.lvl=0;
        this.exp=0;
        this.duels=0;
    }

    public String getName() {
        return name;
    }
    public void damage(int d){
        health-=d;
    }
    public void save(){
        System.out.print("Saving to Save.json");
    }
}
