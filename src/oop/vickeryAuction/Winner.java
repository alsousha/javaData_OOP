package oop.vickeryAuction;

public class Winner {
    private String name;
    private int lastPrice;
    public Winner(String name, int lastPrice){
        this.name = name;
        this.lastPrice=lastPrice;
    }
    public String toString(){
        return this.name + lastPrice;
    }

    public static void main(String[] args) {
        Participant p1 = new Participant("Ben", "12345", 150);
        Participant p2 = new Participant("Kate","2345", 120);
        Participant p3 = new Participant("Alex","3456", 220);
        Participant p4 = new Participant("Dan","4567", 210);

        VickeryAuction prod1 = new VickeryAuction("Product #1", 100);
        System.out.println(prod1.addParticipantInArr(p1));
        System.out.println(prod1.addParticipantInArr(p2));
        System.out.println(prod1.addParticipantInArr(p3));
        System.out.println(prod1.addParticipantInArr(p4));

        System.out.println(prod1.win());


    }
}
