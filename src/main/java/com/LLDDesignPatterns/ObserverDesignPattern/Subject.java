package com.LLDDesignPatterns.ObserverDesignPattern;

/*
YouTube Channel
 */
public interface Subject {
    //Add
    void register(Observer ob);

    //Remove
    void deregister(Observer ob);

    //This method will notify all observers in case of state change.
    void notifyChanges(String title);
}
