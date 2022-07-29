package org.example.structuralpatterns.decorator;

public class GamingComputer extends DecoratorComputer{
    public GamingComputer(Computer computer) {
        super(computer);
    }
    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding characteristics of a gaming computer!");
    }
}
