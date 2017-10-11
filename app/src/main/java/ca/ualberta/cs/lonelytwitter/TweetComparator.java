package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

/**
 * Created by corey on 2017-10-10.
 */

public class TweetComparator implements Comparator<Tweet>{
    // adapted from https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
    // Oct 10

    public int compare(Tweet t1, Tweet t2){
        return t1.getDate().compareTo(t2.getDate());
    }
}
