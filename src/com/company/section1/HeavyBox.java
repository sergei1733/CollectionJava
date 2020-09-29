package com.company.section1;

public class HeavyBox {
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
}
