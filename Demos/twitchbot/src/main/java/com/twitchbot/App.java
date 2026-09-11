package com.twitchbot;
import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.TwitchClientBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Gang Gang" );


        TwitchClient twitchClient = TwitchClientBuilder.builder()
    .withEnableChat(true)
    .build();

System.out.println("Twitch4J connected!");

    }
}
