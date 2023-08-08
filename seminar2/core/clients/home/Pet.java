package src.gb.lessons.interfaces.core.clients.home;

import java.time.LocalDate;

import src.gb.lessons.interfaces.core.clients.Animal;
import src.gb.lessons.interfaces.core.clients.Animals;
import src.gb.lessons.interfaces.core.clients.Soundable;
import src.gb.lessons.interfaces.core.clients.owners.Owner;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals{
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    
}
