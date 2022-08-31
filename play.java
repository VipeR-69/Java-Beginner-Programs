public class play {
    
    private String make;
    private String model;
    private int year;

    play(String make, String model, int year){
        this.setmake(make);
        this.setmodel(model);
        this.setyear(year);
    }

    play(play x){
        this.copy(x);
    }

    public String getmake(){
        return make;
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }

    public void setmake(String make){
        this.make = make;
    }

    public void setmodel(String model){
        this.model = model;
    }

    public void setyear(int year){
        this.year = year;
    }

    public void copy(play x){
        this.setmake(x.getmake());
        this.setmodel(x.getmodel());
        this.setyear(x.getyear());
    }

} 
