
public class Toy {
    private Integer id ;
    private String name;
    private Integer weigth;
    private double chance;

    public Toy(Integer id, String name, Integer weigth, double chance) {
        this.id = id;
        this.name = name;
        this.weigth = weigth;
        this.chance = chance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weigth=" + weigth +
                ", chance=" + chance +
                '}';
    }
}