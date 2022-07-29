package org.example.structuralpatterns.decorator;

public class WorkComputer extends DecoratorComputer{

    public WorkComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding characteristics of a work computer!");
    }

}
