package oop_lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Barsik", 2,"vaccinated", "grey", null, null, 4, false);   
        Animal dog = new Animal("sharik", 2,"vaccinated", "grey", null, null, 4, false);   
        Animal rabbit = new Animal("bnny", 2,"vaccinated", "grey", null, null, 4, false);
        Animal horse = new Animal("black", 2,"vaccinated", "grey", null, null, 4, false); 
        Animal bird = new Animal("cinichka", 2,"vaccinated", "grey", null, null, 2, true); 
        Animal fish = new Animal("carp", 2,"vaccinated", "grey", null, null, 0, false); 
        Animal snake = new Animal("yj", 2,"vaccinated", "grey", null, null, 0, false);
        Animal Flymouse = new Animal("мышь", 2,"vaccinated", "grey", null, null, 4, true); 
        // System.out.println(dog.LetsGo());
        // System.out.println(bird.LetsGo());
        // System.out.println(snake.LetsGo());
        System.out.println(bird.toSwim());
   
  
  
  
   

        // Animal animal = new Animal("Slon", 32, "true", "White",
        // "Mammal", new Owner("Stas"), 4);
        // Animal animal1 = new Animal("Black", "Bird", 2);
        // System.out.println(animal.getAge());
        // animal.setAge(3);
        // System.out.println(animal.getAge());
        // System.out.println(animal);
        // Animal0 animal0 = new Animal0(null, null, null, null, null, null, null);
        // animal0.getAge();
        // System.out.println(animal0);
        // Animal cat = new Animal0();
        // List <Animal> animals = new ArrayList<>();
        // animals.add(new Dog(null, null, null));
        // animals.add(new Cat(null, null, null));
        // animals.add(cat);
        // animals.add(animal);
        // animals.add(animal1);
        // System.out.println(animals);
        // // for (Animal item : animals) {
        // //     if (item instanceof Cat) {
        // //     ((Cat)item).FIndFood(3);
        // //     ((Cat)item).FIndFood();
        // //     }
        // // }
        // Cat barsik = new Cat(null,null,null);
        //     barsik.Hunt();
    }
}
