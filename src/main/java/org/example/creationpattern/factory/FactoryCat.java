package org.example.creationpattern.factory;

public class FactoryCat {

    public Cat getCat(CatType type){
        Cat cat = null;
        switch (type) {
            case LION:
                cat = new Lion();
                break;
            case TIGER:
                cat = new Tiger();
                break;
            case KISENGER:
                cat = new Kisenger();
                break;
            default:
                throw new IllegalArgumentException("Wrong cat type:" + type);
        }
        return cat;
    }
}
