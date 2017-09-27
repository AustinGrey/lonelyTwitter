package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Implementing classes can be tweeted.
 * @author crapo
 * @version 1.0
 * @since 1.0
 */
public interface Tweetable {
    String getMessage();
    Date getDate();

}
