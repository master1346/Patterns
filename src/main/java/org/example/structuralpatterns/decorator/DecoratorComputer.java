package org.example.structuralpatterns.decorator;

public class DecoratorComputer implements Computer{
    protected Computer computer;

    public DecoratorComputer(Computer computer){
        this.computer = computer;
    }

    @Override
    public void assemble() {
        this.computer.assemble();
    }
}
