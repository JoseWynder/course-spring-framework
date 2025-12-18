package io.github.josewynder.springarchitecture.automaker;

public class Key {
    private Automaker automaker;
    private String model;

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
