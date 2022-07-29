package org.example.structuralpatterns.fasad;

public class ZooKeeper {
    private Lion lion;
    private Tiger tiger;

    public ZooKeeper(){
        this.lion = new Lion();
        this.tiger = new Tiger();
    }

    public void lionFeed(){
        lion.feed();
    }
    public void tigerFeed(){
        tiger.feed();
    }

}
