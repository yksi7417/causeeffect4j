package com.yksi7417.appmain;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class AppMain {
    public static void main(String[] args) {
        Config conf = ConfigFactory.load();
        System.out.println("The answer is: " + conf.getString("neo4j-embedded.answer"));
    }
}
