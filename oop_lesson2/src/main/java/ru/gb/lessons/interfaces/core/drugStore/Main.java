package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.drugStore;

import org.w3c.dom.ls.LSSerializer;

import oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.personal.Doctor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy(1);
        Component comp1 = new Component("Penicillin", "10 mg", 3);
        Component comp2 = new Component("Spirit", "100 g", 3);

        pharmacy1.addComponent(comp1).addComponent(comp2);

//        Интерфейс Serializable - отвечает за сериализацию объектов. Превращает объект в массив байтов, который потом
//        можно собрать обратно при помощи десериализатора.

        List<Marker> markers = new ArrayList<>();
        
//        markers.add().add();

//        while (((Iterator<Component>) pharmacy1).hasNext()){
//            System.out.println(pharmacy1.next());
//        }
        System.out.println(pharmacy1);

//        DogPharmacy dogPharmacy = new DogPharmacy();
//        System.out.println(dogPharmacy.hashCode());
        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy(1);
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 3);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy(2);
        Component comp5 = new Component("Penicillin", "10 mg", 3);
        Component comp6 = new Component("Spirit", "100 g", 3);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        Pharmacy pharmacy4 = new Pharmacy(1);
        Component comp7 = new Component("Penicillin", "10 mg", 3);
        Component comp8 = new Component("Spirit", "100 g", 3);
        pharmacy4.addComponent(comp7).addComponent(comp8);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);

        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println("============================================================================");
        System.out.println(nomenclature);


        Set<Pharmacy> resultset = new HashSet<>();
        resultset.add(pharmacy1);
        resultset.add(pharmacy2);
        resultset.add(pharmacy3);
        resultset.add(pharmacy4);

        
        System.out.println(resultset.size()); 
         System.out.println(resultset); 
    }
}
