package com.company.section1;

public class HeavyBox implements Comparable<HeavyBox>{
    private String name;

    public HeavyBox(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
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
