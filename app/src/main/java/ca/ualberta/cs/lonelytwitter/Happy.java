package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by crapo on 9/12/17.
 */

public class Happy extends Mood {

    public Happy(){
        super("Happy");
    }

    public Happy(Date date) {
        super("Happy", date);
    }

    public String format() {
        return getType();
    }
}
