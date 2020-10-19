package com.company.section1;

import java.util.ArrayList;

public class HeavyBox implements Comparable<HeavyBox> {
    private String name;
    private Integer ves;

    public HeavyBox(String name) {
        this.name = name;
    }

    public HeavyBox(String name, Integer ves) {
        this.name = name;
        this.ves = ves;
    }

    @Override
    public String toString() {
        return name;
    }

    public Integer getVes() {
        return ves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(HeavyBox heavyBox) {
        return this.name.compareTo(heavyBox.name);
    }



}
