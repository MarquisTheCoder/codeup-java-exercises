package src.messingAround;
import src.*;

public class Player{
    protected int health;
    protected double[] location;

}

class Location{
    double latitude;
    double longitude;

    public Location(double latitude, double longitude){
        this.latitude =  latitude;
        this.longitude = longitude;
    }

}