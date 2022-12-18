package oop.vickeryAuction;

public class Participant {
    private String name;
    private String id;
    private int price;

    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public Participant(String name, String id, int price){
        this.name = name;
        this.id = id;
        this.price =price;
    }
}
