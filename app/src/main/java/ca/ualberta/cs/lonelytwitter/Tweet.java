
/*
 * Tweet
 *
 * Version 1.0
 *
 * Sept 26 2017
 *
 *
 *
 * Copyright (c) 2017. Team 7. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student
 * Behaviour at the University of Alberta. You may find a copy of the license in this project.
 * Otherwise please contact crapo@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author crapo
 * @version 1.4
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */
public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

    /**
     * Contructs a tweet object.
     * @param message tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood>();
    }

    /**
     * Constructs a tweet object.
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    /**
     * Constructs a tweet object.
     * @param message tweet message
     * @param date tweet date
     * @param moodList list of moods in tweet
     */
    public Tweet(String message, Date date, ArrayList<Mood> moodList) {
        this.message = message;
        this.date = date;
        this.moodList = moodList;
    }

    /**
     * If the tweet is important
     * @return true if tweet is important
     */
    public abstract Boolean isImportant();

    /**
     * Returns the tweet's message
     * @return tweet message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets tweet message
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Returns the tweet date
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the tweet date
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns a string representation of the tweet
     * @return String representation of the tweet
     */
    @Override
    public String toString(){
        return date.toString() + " | " + this.message;
    }

    /**
     * Returns the mood list of the tweet
     * @return ArrayList tweet's list of moods
     */
    public ArrayList<Mood> getMoodList() {
        return moodList;
    }

    /**
     * Sets the mood list of the tweet
     * @param moodList tweet mood list
     */
    public void setMoodList(ArrayList<Mood> moodList) {
        this.moodList = moodList;
    }
}
