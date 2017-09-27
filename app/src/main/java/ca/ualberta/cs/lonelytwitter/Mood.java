package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A tweet mood
 * @author crapo
 * @version 1.0
 * @see Sad
 * @see Happy
 * @since 1.3
 */
public abstract class Mood {

    private String type;
    private Date date;

    /**
     * Contructs a tweet mood
     * @param type mood type
     */
    public Mood(String type) {
        this.type = type;
        this.date = new Date();
    }

    /**
     * Constructs a tweet mood
     * @param type mood type
     * @param date mood date
     */
    public Mood(String type, Date date) {
        this.type = type;
        this.date = date;
    }

    /**
     * Returns a string representation of the mood
     * @return String mood representation
     */
    public abstract String format();

    public String getType() {
        return type;
    }

    //Moods should not have their type set, instead their type is determined by their class
    //public void setName(String type) {
        //this.type = type;
    //}

    /**
     * Returns the mood date
     * @return mood date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the mood date
     * @param date mood date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
