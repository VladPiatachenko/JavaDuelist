package duel;

public class Bot {
    String name;
    int health;
    int atack;
    int defence;
    int hitchance;
    int parry;
    int lvl;
    
    public Bot(String name,int lvl) {
        this.name = name;
        this.health = 100;
        this.atack = 10;
        this.defence = 50;
        this.hitchance = 50;
        this.parry = 15;
        this.lvl=lvl;
    }

    public String getName() {
        return name;
    }
    
    public void damage(int d){
    health-=d;
    }
    
}
