package oop_lesson1;

public class Animal0 extends Animal {
    private Integer eyesCount;
    public Animal0(String name, Integer age, String vaccination, String color, String species, Owner owner,
            Integer legsCount,Boolean wings) {
        super(name, age, vaccination, color, species, owner, legsCount,wings);
        this.eyesCount = 2;
    }
    public  Animal0() {
        this(null, null, null, null, null, null, null,null);
    }
    @Override
    public Integer getAge() {
        // TODO Auto-generated method stub
        return super.getAge();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I'm animal0 ";
    }
    public Integer getEyesCount() {
        return eyesCount;
    }
}
