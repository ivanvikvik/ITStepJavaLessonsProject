package by.itstep.vikvik.javalessons.lesson35;

public class SBox {
    private String value;

    public SBox() {
    }

    public SBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
