package org.example.creationpattern.prototype;

public class Human implements Copyable{

    String name;
    String surname;

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public Object copy() {
       Human copyHuman = new Human(name, surname);
       return copyHuman;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
