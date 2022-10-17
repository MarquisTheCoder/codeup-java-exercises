package src.messingAround;

public class OopConcepts {
    public static void main(String[] args){
      int[] numbers = {1,2,3};

      try{
          System.out.println(numbers[100]);
      }catch(ArrayIndexOutOfBoundsException e){
          e.printStackTrace();
          System.out.println("This is out of bounds");
      }catch(Exception e){
          System.out.println("Caught  generic exception!");
      }finally {
          System.out.println("This will always run.");
      }
    }

}

class Vehicle{
    protected String name;
    protected String type;

    public Vehicle(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void move(){
        System.out.println("I'm definetely used for moving..something..somewhere..");
    };
    public void drive(){
        System.out.println("Not really specified how I do that at this point.");
    };
}

class Car extends Vehicle{
    public Car(String make, String Model){
        super(make, Model);
    }
    public void move(){
        System.out.println("Driving on the road....FAST!");
    }
    public void drive(){
        System.out.println("Pressing gas wearing seatbelt, hands, on wheel.");
    }
}

class Tesla extends Car{
    protected String year;
    public Tesla(String make, String model, String year){
        super(make, model);
        this.year = year;
    }
    public void move(){
        System.out.println("Driving on the road....electronically B-)");
    }
    public void drive(){
        System.out.println("Haha what?...drive?...How nostalgic!");
    }
}

