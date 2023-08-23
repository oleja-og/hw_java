package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private int id;
    private List<Component> components;
    private int componentsCount;

    public Pharmacy(int id) {
        this.id = id;
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }
    public Pharmacy addComponent (Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "id" + id +
                ", components=" + components +
                ", index=" + componentsCount +
                '}'+"Total power = "+getPower(this)+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<Component>() { //Анонимный класс
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//        };
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int result;
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        result = Integer.compare(pow1, pow2);
            if (Integer.compare(pow1, pow2) == 0){
                String str1 = getStr(this);
                String str2 = getStr(o);
                result = CharSequence.compare(str1,str2);
            }
        return result;
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }
    private int getPower (Pharmacy pharm) {
        int result = 0;
        for (Component elem: pharm.getComponents()) {
            result += elem.getPower();
        }
        return result;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setComponents(List<Component> components) {
        this.components = components;
    }
    public int getComponentsCount() {
        return componentsCount;
    }
    public void setComponentsCount(int componentsCount) {
        this.componentsCount = componentsCount;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pharmacy other = (Pharmacy) obj;
        return getId() == other.getId();
    }
    
    private String getStr (Pharmacy o) {
        String str = "";
        for (Component el: o.getComponents()){
            str += el.getName();
        }
        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
