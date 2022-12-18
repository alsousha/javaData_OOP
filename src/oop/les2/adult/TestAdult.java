package oop.les2.adult;

public class TestAdult {
    public static void main(String[] args) {
        Adult a1 = new Adult("Ben", 222333444, "Teacher");
        Adult a2 = new Adult("Dan", 333444222);
        Adult a4 = new Adult("", 333444222);
        Adult a3 = new Adult(a1);

        a1.show();
        a2.show();
        a3.show();
        a4.show();

        System.out.println("\n\n Adults after change data of first adult");
        a1.setSpeciality("Driver");
        a1.show();
        a3.show();
    }

}
