package seminar2.core;

import java.util.ArrayList;
import java.util.List;

import seminar2.core.clients.Animal;
import seminar2.core.clients.Animals;
import seminar2.core.clients.Flyable;
import seminar2.core.clients.Human;
import seminar2.core.clients.Runable;
import seminar2.core.clients.Soundable;
import seminar2.core.clients.Swimable;
import seminar2.core.clients.home.impl.Cat;
import  seminar2.core.clients.home.impl.Dog;
import seminar2.core.clients.home.impl.Fish;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>(); 
    public static void main(String[] args) {
        Human human = new Human("python");
        Cat cat = new Cat(0, "tom", 0, null, null);
        Dog dog = new Dog(0, null, 0, null, null);
        Fish fish = new Fish(0, null, 0, null, null);
        // animals.add(human);
        animals.add(cat);
        animals.add(fish);
        animals.add(dog);
        for(Animals element: animals) {
            allfly(element);
            allrun(element);
            allsound(element);
            allswim(element);
        }
        heal(cat);

    }
    private static void heal(Animals patients) {
        System.out.println(patients.getClassName()+ " Вылечен");
        
    }
    private static void allfly(Animals element) {
            if (element instanceof Flyable){
                System.out.println(element.getClassName()+ " умеет летать");

        }
    }

     private static void allrun(Animals element) {
            if (element instanceof Runable){
                System.out.println(element.getClassName()+ " умеет ходить(бегать)");

        }
    }

    private static void allsound(Animals element) {
            if (element instanceof Soundable){
                System.out.println(element.getClassName()+ " умеет говорить");

        }
    }

    private static void allswim(Animals element) {
            if (element instanceof Swimable){
                System.out.println(element.getClassName()+ " плавать");

        }
    }
        
        
        
    
}

