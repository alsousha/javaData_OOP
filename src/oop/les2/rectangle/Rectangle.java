package oop.les2.rectangle;

public class Rectangle {
    private int length;
    private int weight;

    //create rectangle with default length and width
    public Rectangle() {
        this.length = 10;
        this.weight = 10;
    }

    public Rectangle(int length, int weight) {
        setLength(length);
        setWeight(weight);
    }

    //copy data from another rectangle
    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.weight = rectangle.weight;
    }

    public float getLength() {
        return length;
    }

    public boolean setLength(int length) {
        if (length > 0) {
            this.length = length;
            return true;
        } else {
            this.length = 1; //default length
            return false;
        }
    }

    public float getWeight() {
        return weight;
    }

    public boolean setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
            return true;
        } else {
            this.weight = 1; //default length
            return false;
        }
    }

    public int square() {
        return this.weight * this.length;
    }

    public int perimeter() {
        return (this.weight + this.length) * 2;
    }
    public void show(){
        show('*');
    }
    public void show(char ch){
        for (int i = 0; i < this.weight; i++) {
            for (int j = 0; j < this.length; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
