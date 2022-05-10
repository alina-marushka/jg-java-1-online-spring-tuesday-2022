package instructor.lesson_8.demo_1;

public class Shape {

    protected String borderColor;
    protected String color;

    void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getBorderColor() {
        return borderColor;
    }

    String getColor() {
        return color;
    }
}
