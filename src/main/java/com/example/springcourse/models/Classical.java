package com.example.springcourse.models;

import com.example.springcourse.interfaces.Music;

public class Classical implements Music {
    @Override
    public String getSong() {
        return "Classical Music";
    }
}
