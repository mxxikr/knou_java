package thefifth;

class Triangle implements Figure {
    private double height, width;

    public Triangle(double h, double w) {
        height = h;
        width = w;
    }

    public double getArea() {
        return height * width * 0.5;
    }
}