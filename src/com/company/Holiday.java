
package com.company;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;

public class Holiday {
    int month;
    String name;
    String description;
    int day;
    boolean federal;


    public Holiday(int month, String name, String description, int day, boolean federal){
        this.month=month;
        this.name=name;
        this.description=description;
        this.day=day;
        this.federal=federal;
    }

    public int getMonth(){
        return month;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getDay(){
        return day;
    }
    public boolean federal(){
        return federal;
    }

    public boolean isToday(){
        LocalDateTime now = LocalDateTime.now();
        now.getMonthValue();
        now.getDayOfMonth();
        return (month==isMonth && day == isDay);
    }
}
