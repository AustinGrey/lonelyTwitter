package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by corey on 2017-10-10.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("My Tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testAddTweetException() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("My Tweet");

        tweets.addTweet(myTweet);
        boolean pass = false;
        try {
            tweets.addTweet(myTweet);
        } catch (IllegalArgumentException e){
            pass = true;
        }
        assertTrue(pass);
    }

    public void testDeleteTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("My Tweet");

        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("My Tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testGetTweet() {
        // getTweet method will take an index and will return the tweet of that index
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("My Tweet");

        tweets.addTweet(myTweet);

        Tweet gotTweet = tweets.getTweet(0);

        //assertEquals(myTweet, gotTweet); // Also works but not what the TA wanted

        assertEquals(myTweet.getMessage(), gotTweet.getMessage());
        assertEquals(myTweet.getDate(), gotTweet.getDate());
    }

    public void testGetTweets() {
        // getTweets should return a list of tweets in chronological order
        TweetList tweets = new TweetList();

        Tweet myTweet1 = new NormalTweet("My Tweet", new Date(9999));
        Tweet myTweet2 = new NormalTweet("My Tweet", new Date(9998));
        Tweet myTweet3 = new NormalTweet("My Tweet", new Date(9997));

        tweets.addTweet(myTweet1);
        tweets.addTweet(myTweet2);
        tweets.addTweet(myTweet3);

        ArrayList sortedList = tweets.getTweets();

        assertEquals(myTweet3, sortedList.get(0));
        assertEquals(myTweet2, sortedList.get(1));
        assertEquals(myTweet1, sortedList.get(2));

    }

    public void testGetCount() {
        // count should accurately count up the tweets
        TweetList tweets = new TweetList();

        Tweet myTweet1 = new NormalTweet("My Tweet");

        assertEquals(0, tweets.getCount());

        tweets.addTweet(myTweet1);

        assertEquals(1, tweets.getCount());
    }
}
