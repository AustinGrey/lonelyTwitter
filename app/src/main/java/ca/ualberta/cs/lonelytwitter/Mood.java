package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by crapo on 9/12/17.
 */

public abstract class Mood {

    private String type;
    private Date date;

    public Mood(String type) {
        this.type = type;
        this.date = new Date();
    }

    public Mood(String type, Date date) {
        this.type = type;
        this.date = date;
    }

    public abstract String format();

    public String getType() {
        return type;
    }

    //Moods should not have their type set, instead their type is determined by their class
    //public void setName(String type) {
        //this.type = type;
    //}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
