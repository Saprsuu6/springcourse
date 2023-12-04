package com.example.springcourse.models;

import com.example.springcourse.interfaces.Music;

public class Rock implements Music {
    @Override
    public String getSong() {
        return "Rock Music";
    }
}
