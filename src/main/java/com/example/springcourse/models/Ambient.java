package com.example.springcourse.models;

import com.example.springcourse.interfaces.Music;

public class Ambient implements Music {
    @Override
    public String getSong() {
        return "Ambient";
    }
}
