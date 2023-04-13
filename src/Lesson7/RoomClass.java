package Lesson7;

class RoomClass {
    private double length;
    private double width;
    private double height;
    private String color;

    public RoomClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getArea(double a, double b) {
        return a*b;
    }

}

class roomMain{
    public static void main(String[] args) {
        RoomClass room = new RoomClass(3, 5.5);
        RoomClass room1 = new RoomClass(4, 2.6);

        System.out.println("The area of the first room: " + room.getArea(room.getLength(), room.getWidth()));
        System.out.println("The area of the second room: " + room1.getArea(room1.getLength(), room1.getWidth()));
    }
}
