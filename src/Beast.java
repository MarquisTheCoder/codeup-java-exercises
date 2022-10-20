package src;

public class Beast {

    private int armorClass;
    private int hitPoints;
    private int damage;

    public Beast(){}

    public Beast(int armorClass, int hitPoints, int damage){
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
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
