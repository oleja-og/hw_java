package src.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import src.gb.lessons.interfaces.core.clients.Flyable;
import src.gb.lessons.interfaces.core.clients.Runable;
import src.gb.lessons.interfaces.core.clients.owners.Owner;
import src.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
       System.out.println(CLASS_NAME+"летит со скоростью 5км/ч");
       return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME+"ходит со ходит 2км/ч");
       return 2;
    }
}
