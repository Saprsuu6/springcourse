package com.example.springcourse.models;

import com.example.springcourse.interfaces.Music;

public class Jazz implements Music {
    @Override
    public String getSong() {
        return "Jazz";
    }
}
