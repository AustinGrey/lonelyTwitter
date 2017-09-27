package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A normal tweet, without importance
 * @author crapo
 * @version 1.0
 * @since 1.0
 */
public class NormalTweet extends Tweet {

    /**
     * Contructs a normal tweet
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a normal tweet
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns false, normal tweets are not important
     * @return false tweet is not important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
