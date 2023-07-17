package oop_lesson1;

public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;
    private Boolean wings;

    public Animal(String name, Integer age, String vaccination, String color,
            String species, Owner owner, Integer legsCount, Boolean wings) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
        this.wings = wings;
    }

    public Animal(String color, String species, Integer legsCount, Boolean wings) {
        this(null, null, null, color, species, null, legsCount,wings);
    }
    public Integer getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
    public String toGo() {
        String go = "I'm going ";
        return go;
    }
    public String toFly() {
        String fly = "I'm flying ";
        return fly;
    }
    public String toSwim() {
        String swim = "I'm swimming ";
        return swim;
    }
    public String LetsGo() {
        if (wings == true){
            return toFly()+toGo();
        }
        else if (wings == false && legsCount == 0) {
            return toSwim();
        }
        else if (wings == false && legsCount>0){
            return toGo()+toSwim();
        }
        else {
            return toFly()+toGo()+toSwim();
        }
       
    }
}
