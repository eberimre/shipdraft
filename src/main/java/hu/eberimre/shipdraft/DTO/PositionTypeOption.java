package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.PositionType;

public class PositionTypeOption {

String name;

    public PositionTypeOption(PositionType positionType) {
        this.name = positionType.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
