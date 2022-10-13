package src.movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }
    public String[] getData(){
        return new String[] {this.name, this.category};
    }
    public void setData(String name){
        this.name = name;
    }
    public void setData(String name, String category){
        this.name = name;
        this.category = category;
    }

}
