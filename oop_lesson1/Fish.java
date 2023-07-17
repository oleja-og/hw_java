package oop_lesson1;
    
public class Fish extends Animal{
    private String size;
    public Fish(String name, Integer age, String vaccination, String color, String species, Owner owner,
            Integer legsCount, Boolean wings) {
        super(name, age, vaccination, color, species, owner, legsCount, wings);
        //TODO Auto-generated constructor stub
        this.size = "small";
    }

    public String getSize() {
        return size;
    }
  

    

    
    
    
    

    
    
}
