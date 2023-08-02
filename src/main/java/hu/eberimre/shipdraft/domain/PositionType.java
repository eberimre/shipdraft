package hu.eberimre.shipdraft.domain;

public enum PositionType {

    SPICCER ("spiccer"),
    MIDDLER ("middler"),
    NAVIGATOR ("navigator"),
    KAYAKROWER ("kayak rower"),
    NONROWER ("nonrower");

    private String name;

    PositionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

