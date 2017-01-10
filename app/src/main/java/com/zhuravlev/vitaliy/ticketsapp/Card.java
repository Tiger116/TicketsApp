package com.zhuravlev.vitaliy.ticketsapp;

import java.util.Date;

/**
 * Created by vitaliy.zhuravlyov on 10.01.17.
 */

public class Card {
    String name;
    Date date;
    String place;
    String description;
    int photoId;

    Card() {
        this("default", new Date(System.currentTimeMillis()) , null, null, -1);
    }

    Card(String name, Date date, String place, String description, int photoRes) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.description = description;
        this.photoId = photoRes;
    }
}
