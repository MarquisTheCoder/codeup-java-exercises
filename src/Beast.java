package src;

import java.util.Comparator;

public class Beast implements Comparator<Beast> {

    private int armorClass;
    private int hitPoints;
    private int damage;
    private String name;

    public Beast(){}

    public int compare(Beast one, Beast two){
        return Integer.compare(one.hitPoints, two.hitPoints);
    }

    public Beast(String name){
        this.name = name;
        this.armorClass = 50;
        this.hitPoints = 50;
        this.damage = 50;
    }

    public Beast(String name, int hitPoints, int armorClass){
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = 20;
    }
// THIS IS A LINE
    public String getName(){
        return this.name;
    }
    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    protected Beast clone() throws CloneNotSupportedException {
        Beast clonedBeast = new Beast();
        clonedBeast = this;
        return clonedBeast;
    }
}
