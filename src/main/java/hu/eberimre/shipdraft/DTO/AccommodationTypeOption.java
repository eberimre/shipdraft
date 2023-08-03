package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.AccommodationType;

public class AccommodationTypeOption {

    private String name;
    private int price;

    public AccommodationTypeOption(AccommodationType accommodationType) {
        this.name = accommodationType.getName();
        this.price = accommodationType.getPrice();
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
