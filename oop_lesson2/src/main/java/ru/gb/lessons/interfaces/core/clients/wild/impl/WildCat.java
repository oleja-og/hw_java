package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.Swimable;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Swimable, Soundable {
    public WildCat() {
    }
    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    public int runs(){
        System.out.println("Бегает со скоростью 15 км/ч");
        return 50;
    }

    @Override
    public void sounds() {
        System.out.println("- Мя-я-я-я-у! Ш-ш-ш-ш-ш... \n- Мя-я-я-я-у! Ш-ш-ш-ш-ш... ");
    }

    @Override
    public int swims() {
        return 3;
    }
}
