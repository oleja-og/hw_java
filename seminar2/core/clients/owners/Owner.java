package src.gb.lessons.interfaces.core.clients.owners;

import java.util.ArrayList;
import java.util.List;

import src.gb.lessons.interfaces.core.clients.Animal;
import src.gb.lessons.interfaces.core.clients.Human;

/**
 Хозяин животного, пациента клиники
 */
public class Owner extends Human {

    private final List<Animal> pets; //питомцы, которых человек принес в клинику

    public Owner(String fullName) {
        super(fullName);
        this.pets = new ArrayList<>();
    }

    public List<Animal> getPets() {
        return pets;
    }
}
