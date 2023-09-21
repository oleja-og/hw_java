
public class Toy {
    private String id ;
    private String name;
    private String weigth;
    private String chance;

    public Toy(String id, String name, String weigth, String chance) {
        this.id = id;
        this.name = name;
        this.weigth = weigth;
        this.chance = chance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(String id) {
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

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(String chance) {
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