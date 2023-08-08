package src.gb.lessons.interfaces.core.clients.home.impl;

import java.time.LocalDate;

import src.gb.lessons.interfaces.core.clients.Flyable;
import src.gb.lessons.interfaces.core.clients.Swimable;
import src.gb.lessons.interfaces.core.clients.home.Pet;
import src.gb.lessons.interfaces.core.clients.owners.Owner;

public class Fish extends Pet implements Swimable,Flyable {
    public Fish() {
    }

    public Fish(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME+" плывет со скоростью 15км/ч");
        return 15;
    }

    @Override
    public int fly() {
       System.out.println(CLASS_NAME+" летает со скоростью 15км/ч");
        return 15;
    }
}
