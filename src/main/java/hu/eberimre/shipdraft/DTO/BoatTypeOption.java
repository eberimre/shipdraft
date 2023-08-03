package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.BoatType;

public class BoatTypeOption {

    private String name;
    private int price;

    public BoatTypeOption(BoatType boatType) {
        this.name = boatType.getName();
        this.price = boatType.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
