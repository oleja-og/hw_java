package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Flyable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Parrot extends Pet implements Flyable, Runnable, Soundable {
    public Parrot(){

    }
    public Parrot (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int runs() {
        return 4;
    }
    @Override
    public int flies() {
        return 20;
    }
    @Override
    public void sounds() {
        System.out.println("- Попка дур-р-рак!!!");
    }

}
