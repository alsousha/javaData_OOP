package oop.les2.person;
//Bogdanov Alsu 333988939
//Barak Tsach 300096245
public class TestPerson {
    public static void main(String[] args) {
        //persons
        Person p1 = new Person("Ben");
        Person p4 = new Person("Kate");
        Person p5 = new Person("Roma", p4);
        Person p3 = new Person("Olga");
        Person p2 = new Person("Dan", null); //Create Dan with null partner

        //0. Roma with Kate
        System.out.println("\n//Intro. Roma with Kate. Ben, Olga and Dan are single");
        p4.show();
        p5.show();
        p1.show();
        p3.show();
        p2.show();


        //2. set Ben with himself (Ben with Ben -> not change his status)
        System.out.println("\n//Ben with himself -> not change his status (without partner)");
        p1.setPartner(p1); //!!!
        p1.show();

//        //3. set for Dan partner Olga
        p2.setPartner(p3);
        System.out.println("\n//set for Dan (he is single) partner Olga (she is single)");
        p2.show();
        p3.show();

//        //4. Change partner
        System.out.println("\n//change Olga's partner. Now Olga with single Ben and Dan is single");
        p3.setPartner(p1);
        p3.show();
        p1.show();
        p2.show();


        //5. Olga with Roma => Kate is single, Ben is single
        System.out.println("\n//Olga with Roma (his ex wife is Kate). Now Kate is single end ex Olga's husband Ben is single");
        p3.setPartner(p5);
        p1.show();
        p4.show();
        p3.show();
        p5.show();
    }
}
