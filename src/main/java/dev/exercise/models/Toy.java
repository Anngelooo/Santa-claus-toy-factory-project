package dev.exercise.models;

public class Toy {

    protected String id;
    protected String title;
    protected boolean isGoodToy;

    public Toy(String tittle, boolean isGoodToy){
        this.title = tittle;
        this.isGoodToy = isGoodToy;
    }

    public String getId(){
        return id;
    }

    public void setId(int id){
        if (isGoodToy) {
            this.id = "B" + id;
        } else {
            this.id = "M" + id;
        }
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;

    }
}
