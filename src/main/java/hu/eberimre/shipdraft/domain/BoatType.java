package hu.eberimre.shipdraft.domain;

public enum BoatType {

    CANOE ("canoe", 1000),
    KAYAKSOLO ("kayak-solo", 1000),
    KAYAKDUO ("kayak-duo", 1000),
    PRIVATE ("private", 0),
    NONE ("not adequate", 0);

    private String name;
    private int price;

    BoatType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
