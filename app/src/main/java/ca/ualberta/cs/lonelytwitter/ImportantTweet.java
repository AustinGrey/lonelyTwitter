package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

/**
 * An important tweet
 * @author crapo
 * @version 1.0
 * @since 1.0
 */
public class ImportantTweet extends Tweet implements Tweetable {
    /**
     * Constructs an important tweet
     * @param message tweet message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructs an important tweet
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }
/**
     * Returns if tweet is important or not
     * @return true important tweets are important
     */
=======
public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

>>>>>>> elasticsearch
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
<<<<<<< HEAD
=======


>>>>>>> elasticsearch
}
