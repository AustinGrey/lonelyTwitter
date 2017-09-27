package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * A sad tweet mood
 * @author crapo
 * @version 1.0
 * @since 1.0
 */
public class Sad extends Mood {

    /**
     * Contructs a sad mood
     */
    public Sad(){
        super("Sad");
    }

    /**
     * Contructs a sad mood
     * @param date mood date
     */
    public Sad(Date date) {
        super("Sad", date);
    }

    /**
     * Returns a string representation of the mood
     * @return String mood
     */
    public String format() {
        return getType();
    }
}
