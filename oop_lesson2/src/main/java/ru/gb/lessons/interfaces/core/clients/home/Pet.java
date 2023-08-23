package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animals;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }
    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
