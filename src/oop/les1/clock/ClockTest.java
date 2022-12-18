package oop.les1.clock;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
public class ClockTest {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.show();
        System.out.println();

        clock1.setHours(23);
        clock1.setMinutes(20);
        clock1.setSeconds(59);
        clock1.show();

        System.out.println();
        clock1.tock();
        clock1.show();
        System.out.println();
        System.out.println();
        System.out.println();
        clock1.setHours(23);
        clock1.showPM();
        clock1.setHours(5);
        clock1.showPM();


        clock1.setHours(0);
        clock1.showPM();

        clock1.setHours(11);
        clock1.showPM();
        clock1.setHours(12);
        clock1.showPM();
        clock1.setHours(13);
        clock1.showPM();
        System.out.println();
        System.out.println("The hour is around " + clock1.getHours());


    }
}
