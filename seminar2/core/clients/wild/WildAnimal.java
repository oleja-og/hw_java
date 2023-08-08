package seminar2.core.clients.wild;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import seminar2.core.clients.Animal;
import seminar2.core.clients.Animals;
import seminar2.core.clients.Soundable;
import seminar2.core.clients.owners.Owner;
import seminar2.core.clients.supports.Record;

/**
 Абстракция дикого животного
 */
public class WildAnimal extends Animal implements Animals {
    public WildAnimal() {
    }

    private WildAnimal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner, List<Record> records) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    public WildAnimal(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = null;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
        
    }

   
}
