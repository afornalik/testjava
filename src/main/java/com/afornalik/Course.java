package com.afornalik;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Course {

    private final String name;
    private final LocalDate startData;


    public Course(String name, LocalDate startData) {
        this.name = name;
        this.startData = startData;
    }

    public String name() {
        return name;
    }

    public boolean isStartedBefore(LocalDate localeData) {
        if(startData.isBefore(localeData)) {
            return false;
        }else {
            return false;
        }
    }

    public boolean isStarted() {
        return isStartedBefore(LocalDate.now());
    }
}
