package src.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import src.gb.lessons.interfaces.core.clients.Runable;
import src.gb.lessons.interfaces.core.clients.owners.Owner;
import src.gb.lessons.interfaces.core.clients.wild.WildAnimal;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME+"бегает со скоростью 15км/ч");
        return 15;
    }
}
