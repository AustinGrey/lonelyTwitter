package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A happy tweet mood
 * @author crapo
 * @version 1.0
 * @since 1.0
 */
public class Happy extends Mood {

    /**
     * Constructs a happy mood
     */
    public Happy(){
        super("Happy");
    }

    /**
     * Constructs a happy mood
     * @param date mood date
     */
    public Happy(Date date) {
        super("Happy", date);
    }

    /**
     * Returns a String representation of the mood
     * @return String representation of the mood
     */
    public String format() {
        return getType();
    }
}
