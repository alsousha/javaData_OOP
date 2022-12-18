package oop.les1.song;

public class SongTest {

    public static String largeDiscNAme(Disc d1, Disc d2){
        if(d1.getSongCount() > d2.getSongCount()) return d1.getDiscName();
        else return  d2.getDiscName();
    }
    public static void main(String[] args) {
        Song s = new Song("The Wail", 231, "PF");
        System.out.println(s.status());
    }
}
