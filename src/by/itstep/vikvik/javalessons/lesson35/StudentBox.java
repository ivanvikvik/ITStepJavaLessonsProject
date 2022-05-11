package by.itstep.vikvik.javalessons.lesson35;

public class StudentBox {
    private Student value;

    public StudentBox() {
    }

    public StudentBox(Student value) {
        this.value = value;
    }

    public Student getValue() {
        return value;
    }

    public void setValue(Student value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
