package com.amigodeumamigomeu.entities;

import java.util.ArrayList;

/**
 * Created by angus on 22/02/17.
 */

public class Friend {

    private String name;
    private String nickname;
    private String country;
    private String city;

    public Friend(String name, String nickname, String country, String city) {
        this.name = name;
        this.nickname = nickname;
        this.country = country;
        this.city = city;
    }

    //TO DO Remover isso
    public static ArrayList<Friend> getFriends() {
        ArrayList<Friend> friends = new ArrayList<Friend>();
        for (int i = 0; i < 10; i++){

            friends.add(new Friend("Irineu" + i, "Nao sabe nem eu",  "country", "city"));
        }
        return friends;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
