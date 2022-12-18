package oop.les1.clock;

public class Clock {
    private int minutes, hours, seconds;

    public void setMinutes(int m) {
        minutes = m;
        if (minutes < 0 || minutes >= 60) {
            minutes = 0;
            System.out.println("Minutes valid is between 0-59");

        }
    }

    public void setSeconds(int s) {
        seconds = s;
        if (seconds < 0 || seconds >= 60) {
            seconds = 0;
            System.out.println("Seconds valid is between 0-59");

        }
    }

    public void setHours(int h) {
        hours = h;
        if (hours < 0 || hours >= 24) {
            hours = 0;
            System.out.println("Hours valid value is between 0-23");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    //counter for minutes
    public void tick() {
        minutes++;
//        hours += minutes / 60;
//        minutes %= 60;
//        hours %= 24;
        if(minutes ==60) tock();
        minutes%=60;
    }

    //counter for seconds
    public void tack() {
        seconds++;
        if(seconds == 60 ) tick();
        seconds%=60;
//        minutes += seconds / 60;
//        hours += minutes / 60;
//        seconds %= 60;
//        minutes %= 60;
//        hours %= 24;
    }

    //counter for hours
    public void tock() {
        hours++;
        hours %= 24;
    }


    //show time in format HH:MM:SS
    public void show() {
        if (hours < 10) System.out.print("0");
        System.out.print(hours + ":");
        if (minutes < 10) System.out.print("0");
        System.out.print(minutes + ":");
        if (seconds < 10) System.out.print("0");
        System.out.print(seconds);
    }

    //show hours in format 'HH pm/am'. 00:00 is 12:00am; 12:00 is 12:00pm
    public void showPM() {

        System.out.print( (hours == 0 || hours == 12)  ? 12 + ":" : hours % 12 + ":");
        if (minutes < 10) System.out.print("0");
        System.out.print(minutes);
        if (hours < 12) System.out.println("am");
        else System.out.println("pm");
    }


}
