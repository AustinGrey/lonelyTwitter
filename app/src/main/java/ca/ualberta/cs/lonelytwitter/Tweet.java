package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by crapo on 9/12/17.
 */

public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date, ArrayList<Mood> moodList) {
        this.message = message;
        this.date = date;
        this.moodList = moodList;
    }

    public abstract Boolean isImportant();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + this.message;
    }

    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    public void setMoodList(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }
}
