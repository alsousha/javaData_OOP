package oop.lec3.hw1_point;

//import static java.lang.Math.*;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
public class Point1 {
    private int _x;
    private int _y;

    //set only positive coordinates
    public Point1(int x, int y) {
        setX(Math.max(x, 0));
        setY(Math.max(y, 0));
    }

    public Point1(Point1 other) {
        setX(other._x);
        setY(other._y);
    }

    public int getX() {
        return _x;
    }

    public void setX(int num) {
        if (num >= 0) this._x = num;
    }

    public int getY() {
        return _y;
    }

    public void setY(int num) {
        if (num >= 0) this._y = num;
    }

    @Override
    public String toString() {
        return "(" + _x + "," + _y + ")";
    }

    public boolean equals(Point1 other) {
        return this._x == other._x && this._y == other._y;
    }

    public boolean isAbove(Point1 other) {
        return (this._y > other._y);
    }

    public boolean isUnder(Point1 other) {
        return other.isAbove(this);
    }

    public boolean isLeft(Point1 other) {
        return this._x < other._x;
    }

    public boolean isRight(Point1 other) {
        return other.isLeft(this);
    }

    public double distance(Point1 p) {
        return Math.sqrt(Math.pow(this._x - p._x, 2) + Math.pow(this._y - p._y, 2));
    }
    public void move(int dx, int dy) {
        if (this._x + dx >= 0 && this._y + dy >= 0) {
            this._x += dx;
            this._y += dy;
        }
    }
}
