package oop.les1.song;


public class Song {
    private String name;
    private String performer;
    private int length;

    public Song(String name, int length, String performer) {
        setLength(length);
        setPerformer(performer);
        setName(name);
        // this.name = name;
        // this.performer = performer;
        // this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) this.length = length;
    }

    public String toString() {
        String str = name + " " + performer + " " + length;
        return str;
    }

    public String status() {
        //Buku/Ququ:120
        String res = "";
        res += getPerformer() + "/" + getName() + ":" + getLength();
        return res;

    }

}

