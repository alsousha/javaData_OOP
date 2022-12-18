package oop.les1.car;
import java.util.Scanner;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
public class TestCar {
    static String answer;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car car1 = new Car();
        boolean stopProgramm = false;
        int targetSpeed;
        int option;

        //menu with options
        System.out.println("Hi! I am your car assistant. Please set car's number: ");
        changeCarNumber(car1);
        while(!stopProgramm) {
            do {
                System.out.println("Choose option:\n\n"
                        + "0: exit;\n"
                        + "1: get car's info;\n"
                        + "2: increase car's speed;\n"
                        + "3: slow down car's speed;\n"
                        + "4: stop car;\n"
                        + "5: change car's number;\n"
                    );
                option = scan.nextInt();
                if(option<0 || option >5)
                    System.out.println("Error! Choose correct number of option. Try again.");
            }while(option<0 || option >5);

            switch(option) {
                case(0):
                    stopProgramm = true;
                    System.out.println("By! I am glad to help you");
                    break;
                case(1):
                    System.out.println(car1);
                    break;
                case(2):
                    System.out.println("how much to increase the speed? Max speed is "+car1.getMaxSpeed()+"km/h");
                    int delta = scan.nextInt();

                    //check new speed
                    while(car1.getCarSpeed() + delta > car1.getMaxSpeed()){
                        System.out.println("Sorry! I can't to increase car's speed in " + delta +"km/h. Max speed is "+car1.getMaxSpeed()+"km/h. Try again");
                        delta = scan.nextInt();
                    }
                    //increase speed with loop
                    targetSpeed = car1.getCarSpeed() + delta;
                    for (int i = car1.getCarSpeed(); i < targetSpeed; i++) {
                        car1.increaseSpeed();
                    }
                    System.out.println("Successfully! " + car1);
                    break;
                case(3):
                    System.out.println("how much do you want to slow down");
                    delta = scan.nextInt();
                    //check new speed
                    while(car1.getCarSpeed() - delta <= 0){
                        System.out.println("Sorry! I can't to slow down car's speed in " + delta +"km/h. Min speed is 0km/h. Try again");
                        delta = scan.nextInt();
                    }
                    //slow down speed with loop
                    targetSpeed = car1.getCarSpeed() - delta;
                    for (int i = car1.getCarSpeed(); i > targetSpeed; i--) {
                        car1.slowSpeed();
                    }
                    System.out.println("Successfully! " + car1);
                    break;
                case(4):
                    car1.stopCar();
                    System.out.println("Successfully! " +car1);
                    break;
                case(5):
                    System.out.println("Enter car's number for change: ");
                    changeCarNumber(car1);
                    break;

            }
        }
    }
    public static void changeCarNumber(Car car){
        Scanner scan = new Scanner(System.in);
        answer = scan.next();
        while (answer.equals("") || !answer.matches("[a-zA-Z0-9]*")){
            System.out.println("Sorry! Enter correct car's number. Number must contain only numbers and/or letters. Try again.");
            answer = scan.next();
        }
        car.setCarNumber(answer);
        System.out.println("Successfully! Car number is " + car.getCarNumber());
    }
}
