package oop.les2.rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7,3);
        Rectangle r3 = new Rectangle(5,-4); //with incorrect length
        Rectangle r4 = new Rectangle(r1);
        System.out.println("\nR1 (l: " + r1.getLength() + "; w: "+ r1.getWeight()+ ")");
        System.out.println("Rectangle with default length and wight");
        r1.show();
        System.out.println("\nR2 (l: " + r2.getLength() + "; w: "+ r2.getWeight()+ ")");
        r2.show();
        System.out.println("\nR3 (l: " + r3.getLength() + "; w: "+ r3.getWeight()+ ")");
        System.out.println("Incorrect length will be change to 1");
        r3.show();
        System.out.println("\nR4 (l: " + r4.getLength() + "; w: "+ r4.getWeight()+ ")");
        System.out.println("Rectangle with length and wight of rectangle r1 (copy object)");
        r4.show();
        r4.setLength(4);
        System.out.println("\nR4 (l: " + r4.getLength() + "; w: "+ r4.getWeight()+ ")");
        System.out.println("Rectangle r4 after set length. Print with other char");
        r4.show('$');
        System.out.println();
        System.out.println("Square of r2: " + r2.square());
        System.out.println("Perimeter of r2: " + r2.perimeter());

    }
}
