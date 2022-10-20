package src;

public class Home {

    private Person owner;
    public Person[] residents;

    public Home(){}

    public Home(Person owner){
        this.owner = owner;
    }

    public Home(Person owner, Person[] residents){
        this.owner = owner;
        this.residents = residents;
    }
    public void setOwner(Person person){
        this.owner = person;
    }
    public Person getOwner(){
        return this.owner;
    }


}
