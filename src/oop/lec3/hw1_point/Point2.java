package oop.lec3.hw1_point;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

public class Point2 {
    private double double_radius;
    private double double_alpha;

    public Point2(int x, int y) {
        x = Math.max(x, 0);
        y = Math.max(y, 0);
        setRadiusAndAlfa(x, y);
    }

    public Point2(Point2 other) {
        this.double_alpha = other.double_alpha;
        this.double_radius = other.double_radius;
    }

    public int getX() {
        return (int) Math.round(double_radius * Math.cos(double_alpha * Math.PI / 180));
    }
    public int getY() {
        return (int) Math.round(double_radius * Math.sin(double_alpha * Math.PI / 180));
    }

    public void setX(int x) {
        if (x > 0)
            setRadiusAndAlfa(x, this.getY());
    }

    public void setY(int y) {
        if (y > 0)
            setRadiusAndAlfa(this.getX(), y);
    }

    public boolean equals(Point2 other) {
        return this.double_radius == other.getDouble_radius() && this.double_alpha == other.getDouble_alpha();
    }
    public boolean isAbove(Point2 other) {
        return this.getY() > other.getY();
    }

    public boolean isUnder(Point2 other) {
        return other.isAbove(this);
    }

    public boolean isLeft(Point2 other) {
        return this.getX() < other.getX();
    }
    public boolean isRight(Point2 other) {
        return other.isRight(this);
    }

    public double distance(Point2 other) {
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
    }

    public void move(int dX, int dY) {
        if (this.getX() + dX >= 0 && this.getY() + dY >= 0) {
            setRadiusAndAlfa(this.getX() + dX, this.getY() + dY);
        }
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
    private double getDouble_radius() {
        return double_radius;
    }
    private double getDouble_alpha() {
        return double_alpha;
    }
    private void setRadiusAndAlfa(int x, int y) {
        this.double_radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        this.double_alpha = (Math.atan((double) y / x)) * 180 / Math.PI;
    }
}
