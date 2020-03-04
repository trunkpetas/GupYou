package com.ctbarbanza.gupyou.models;

import androidx.annotation.NonNull;

public class User {

    //Aquí he creado cada String que me faltaba, osea, cada red social
    public String uid;
    public String nick;
    public String name;
    public String img;
    public String facebook;
    public String google;
    public String twitter;
    public String instagram;
    public String linkedin;
    public String snapchat;
    public String tiktok;
    public String twitch;
    public String tinder;


    @Override
    public String toString() {
        return ""+uid+"|"+nick+"|"+name+"|"+img;
    }
}
