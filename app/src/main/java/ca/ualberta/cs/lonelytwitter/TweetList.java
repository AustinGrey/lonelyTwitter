package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by corey on 2017-10-10.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // add a tweet to a list of tweets
    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    // delete a tweet from a list of tweets
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    //check if a list of tweets has the specified tweet,
    // if it does, return true, otherwise return false
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){

        Collections.sort(tweets, new TweetComparator());
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }
}
