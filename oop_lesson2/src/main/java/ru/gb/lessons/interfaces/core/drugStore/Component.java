package oop_lesson2.src.main.java.ru.gb.lessons.interfaces.core.drugStore;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }
    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }
    public int getPower() {
        return this.power;
    }

    public String getName() {
        return name;
    }

    
}
