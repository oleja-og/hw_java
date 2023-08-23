package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animals;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;


import java.time.LocalDate;
import java.util.ArrayList;


/**
 Абстракция дикого животного
 */
public class WildAnimal extends Animal implements Animals {
    public WildAnimal() {
    }

// Зачем нам конструктор с параметром reсords, если в родительском классе в конструкторе этот параметр отсутствует?
//    private WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
//        super(id, name, numberOfLimbs, registrationDate, owner);
//    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }

}
