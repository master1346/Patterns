package org.example.structuralpatterns.adapter;

public class SkyscrapperBuilder implements AdvancedBuilder{

    @Override
    public void buildHouse(String location) {

    }

    @Override
    public void buildSkyscrapper(String location) {
        System.out.println("Building a skyscrapper in the " + location + "area!");
    }
}
