package com.LLDDesignPatterns.ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        //Aman has subscribed this channel
        channel.register(aman);
        Subscriber raman = new Subscriber("Raman");
        channel.register(raman);

        //channel.notifyChanges();

        //Adding title of new video upload
//        channel.notifyChanges("Learn Design Pattern");
//        channel.notifyChanges("Angular Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new subscriber");
            System.out.println("Press 3 to Exit");

            int c = Integer.parseInt(br.readLine());
            if(c == 1){
                //new video upload code
                System.out.println("Enter Video Title ");
                String videoTitle = br.readLine();
                channel.notifyChanges(videoTitle);
            }
            else if(c == 2){
                //create new subscriber
                System.out.println("Enter name of Subscriber:");
                String subsname = br.readLine();
                Subscriber subscriber = new Subscriber(subsname);
                channel.register(subscriber);
            }
            else{
                //exit
                System.out.println("Thank you for using App");
                break;
            }
        }

    }
}
