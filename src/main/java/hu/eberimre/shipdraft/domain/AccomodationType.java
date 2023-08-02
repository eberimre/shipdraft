package hu.eberimre.shipdraft.domain;

public enum AccomodationType {

    TENT ("tent", 1000),
    WOODHOUSE ("woodhouse", 2000),
    HOTELROOM ("hotel room", 4000),
    NONE ("not adequate", 0);


    private final String name;
    private final int price;

    AccomodationType(String name, int price) {
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
