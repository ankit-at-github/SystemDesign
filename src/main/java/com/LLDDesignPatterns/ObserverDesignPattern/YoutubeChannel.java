package com.LLDDesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subscribersList = new ArrayList<>();

    @Override
    public void register(Observer ob) {
        this.subscribersList.add(ob);
    }

    @Override
    public void deregister(Observer ob) {
        this.subscribersList.remove(ob);
    }

    @Override
    public void notifyChanges(String title) {
        for(Observer ob : subscribersList){
            ob.notified(title);
        }
    }
}
