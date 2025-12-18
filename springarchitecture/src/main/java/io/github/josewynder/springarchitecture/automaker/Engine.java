package io.github.josewynder.springarchitecture.automaker;

public class Engine {
    private String model;
    private Integer horsePower;
    private Integer cylinders;
    private Double literage;
    private EngineType engineType;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getLiterage() {
        return literage;
    }

    public void setLiterage(Double literage) {
        this.literage = literage;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", cylinders=" + cylinders +
                ", literage=" + literage +
                ", engineType=" + engineType +
                '}';
    }
}
