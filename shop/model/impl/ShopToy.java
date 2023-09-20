
public class ShopToy {
    private List<Toy> toys;
    private int index;

    public ShopToy(List<Toy> toys, int index) {
        this.toys = toys;
        this.index = index;
    }

    public ShopToy addToy(Toy toy){
        this.toys.add(toy);
        return this;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ShopToy{" +
                "toys=" + toys +
                ", index=" + index +
                '}';
    }
}