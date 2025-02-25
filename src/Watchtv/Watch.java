
package Watchtv;

import java.time.ZoneId;
import java.time.ZonedDateTime;



public class Watch {
    
    private int hour;
    private int minute;
    private int second;

    
    public Watch(int hour, int minute, int second){
        
        this.hour = hour;
        
        this.minute = minute;
        
        this.second = second;
        
        
    }
    
    public Watch(int hour, int minute){
        this(hour,minute,0);
    }
    
    public Watch(int hour){
        this(hour,0,0);
    }

    public Watch(){  
        
    }
    
    
    
    public int gethour(){
        return hour;
    }
    public void sethour(int hour){
        this.hour = hour;
    }
    
    public int getminute(){
        return minute;
    }
    public void setminute(int minute){
        this.minute = minute;
    }
    
    
    public int getsecond(){
        return second;
    }
    public void setsecond(int second){
        this.second = second;
    }
    
    
    public String getTimeZone(String zone) {
        ZoneId id = ZoneId.of(zone);
        ZonedDateTime DateTime = ZonedDateTime.now(id);
        return DateTime.toString();
    }
    
}
