package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Chicken extends Pet implements Runnable, Soundable {
    public Chicken() {
    }
    public Chicken (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int runs() {
        return 5;
    }
    @Override
    public void sounds() {
        System.out.println("- Кудах-тах-тах!");
    }
}
