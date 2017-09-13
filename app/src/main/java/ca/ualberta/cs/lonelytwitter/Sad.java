package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by crapo on 9/12/17.
 */

public class Sad extends Mood {

    public Sad(){
        super("Sad");
    }

    public Sad(Date date) {
        super("Sad", date);
    }

    public String format() {
        return getType();
    }
}
