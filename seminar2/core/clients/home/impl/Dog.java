package seminar2.core.clients.home.impl;

import java.time.LocalDate;

import seminar2.core.clients.Runable;
import seminar2.core.clients.Soundable;
import seminar2.core.clients.home.Pet;
import seminar2.core.clients.owners.Owner;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Runable, Soundable{
    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME+" бежит со скоростью 15км/ч");
        return 15;
    }

    @Override
    public void sound() {
        String sound = "Гав";
        System.out.println(CLASS_NAME+" издает звук "+sound);
    }
}
