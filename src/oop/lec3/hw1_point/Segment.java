package oop.lec3.hw1_point;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245

public class Segment {
    private Point1 _poLeft;
    private Point1 _poRight;

    public Segment(Point1 left, Point1 right) {
        this._poLeft = new Point1(left);
        //two points need to be parallel
        this._poRight = new Point1(right.getX(), left.getY());
    }

    public Segment(int leftX, int leftY, int rightX, int rightY) {
        this._poLeft = new Point1(leftX, leftY);
        this._poRight = new Point1(rightX, leftY);
    }

    public Segment(Segment other) {
        this._poLeft = other.getPoLeft();
        this._poRight = other.getPoRight();
    }

    public Point1 getPoLeft() {
        return this._poLeft;
    }

    public Point1 getPoRight() {
        return this._poRight;
    }

    public int getLength() {
        return this._poRight.getX() - this._poLeft.getX(); //we know that coordinates Y are equals
    }

    public String toString() {
        return _poLeft.toString() + "___" + _poRight.toString();
    }

    public boolean equals(Segment other) {
        return this._poLeft.equals(other._poLeft) && this._poRight.equals(other._poRight);
    }

    public boolean isAbove(Segment other) {
        return this._poLeft.getY() > other.getPoLeft().getY();
    }

    public boolean isUnder(Segment other) {
        return other.isAbove(this);
    }

    public boolean isLeft(Segment other) {
        return this.getPoRight().getX() < other.getPoLeft().getX();
    }

    public boolean isRight(Segment other) {
        return this.getPoLeft().getX() > other.getPoRight().getX();
    }

    public void moveHorizontal(int delta) {
        this._poLeft.move(delta, 0);
        this._poRight.move(delta, 0);
//        this._poLeft.setX(this._poLeft.getX() + delta);
//        this._poRight.setX(this._poRight.getX() + delta);
    }

    public void moveVertical(int delta) {
        this._poLeft.move(0, delta);
        this._poRight.move(0, delta);
//        this._poLeft.setY(this._poLeft.getY() + delta);
//        this._poRight.setY(this._poRight.getY() + delta);
    }

    public void changeSize(int delta) {
        if (this._poRight.getX() + delta > this._poLeft.getX())
            //this._poRight.setX(this._poRight.getX() + delta);
            this._poRight.move(delta,0);
    }

    public boolean pointOnSegment(Point1 p) {
        return p.getX() >= this._poLeft.getX() && p.getX() <= this._poRight.getX();
    }

    public boolean isBigger(Segment other) {
        return this._poRight.distance(this._poLeft) > other.getPoRight().distance(other.getPoLeft());
    }

    public int overlap(Segment other) {
        int overlap = 0;

        if(other.pointOnSegment(this._poLeft)||other.pointOnSegment(this._poRight)||this.pointOnSegment(other.getPoLeft())||this.pointOnSegment(other.getPoRight())){
            int targetXLeft=Math.max(other.getPoLeft().getX(), this._poLeft.getX());
            int targetXRight=Math.min(other.getPoRight().getX(),this._poRight.getX());
            overlap=Math.max(0, targetXRight-targetXLeft);
        }
        return overlap;
    }

    public  double trapezePerimeter(Segment other){
        return this._poLeft.distance(this._poRight)+this._poRight.distance(other.getPoRight())+other.getPoRight().distance(other.getPoLeft())+other.getPoLeft().distance(this._poLeft);
    }

//    public static void main(String[] args) {
//        Point1 p1 = new Point1(7, 9);
//        Point1 p3 = new Point1(3, 9);
//
//        Segment s1 = new Segment(3,5,9,5);
//        System.out.println(s1);
//        Segment s2 = new Segment(p1, p3);
//        System.out.println(s2);
//
//        System.out.println(s1.trapezePerimeter(s2));
//
//    }
}
