package com.amigodeumamigomeu.entities;

import java.util.ArrayList;

/**
 * Created by angus on 21/02/17.
 */

public class Feed {

    public String name;
    public String hometown;

    public Feed(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<Feed> getUsers() {
        ArrayList<Feed> users = new ArrayList<Feed>();
        users.add(new Feed("Harry", "San Diego"));
        users.add(new Feed("Marla", "San Francisco"));
        users.add(new Feed("Sarah", "San Marco"));
        return users;
    }

}
