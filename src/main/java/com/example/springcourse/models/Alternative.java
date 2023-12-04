package com.example.springcourse.models;

import com.example.springcourse.interfaces.Music;

public class Alternative implements Music {
    @Override
    public String getSong() {
        return "Aternative";
    }
}
