package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Swimable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runnable, Swimable, Soundable {
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }


    @Override
    public int runs() {
        return 30;
    }

    @Override
    public void sounds() {
        System.out.println("- Гав! Гав! Гав!");
    }

    @Override
    public int swims() {
        return 3;
    }
}
