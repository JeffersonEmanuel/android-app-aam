package com.amigodeumamigomeu.entities;

import java.util.ArrayList;

/**
 * Created by angus on 22/02/17.
 */

public class Event {

    private String title;
    private String subTitle;
    private int qtPessoas;


    public Event(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public Event(String title, String subTitle, int qtPessoas) {
        this.title = title;
        this.subTitle = subTitle;
        this.qtPessoas = qtPessoas;
    }

    public int getQtPessoas() {
        return qtPessoas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }


    //TO DO Remover isso
    public static ArrayList<Event> getGroups() {
        ArrayList<Event> groups = new ArrayList<Event>();

    groups.add(new Event("Vamo tomar 1"," Alguem quer ir",1));
    groups.add(new Event("Vamo tomar 2"," Alguem quer ir",2));
    groups.add(new Event("Vamo tomar 3"," Alguem quer ir",3));
    groups.add(new Event("Vamo tomar 4"," Alguem quer ir",4));
        return groups;
    }
}
