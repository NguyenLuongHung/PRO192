//your job is to complete this class
public class Meeting{   
    private String who;
    private String day;
    private int duration;
    
    public String getWho(){
        return this.who;
    }
    public String getDay(){
        return this.day;
    }
    public int getDuration(){
        return this.duration;
    }
    public void setWho(String who){
        this.who = who;
    }
    public void setDay(String day){
        this.day = day;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    @Override
    public boolean equals(Object o) {
        return this.day.equals(((Meeting)o).getDay());
    }
    
    public Meeting(String who, String day, int duration) {
        this.day = day;
        this.who = who;
        this.duration = duration;
    }  
    //add and complete you other methods (if needed) here   
    public String toString(){
        return String.format("%-20s%-20s%-20d\n", day,who,duration);
    }

}
