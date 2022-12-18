package oop.les1.song;

public class Disc {
    private String discName;
    private int songCount = 0;

    private final int DEFAULT_SIZE = 10;
    private Song[] songs = new Song[DEFAULT_SIZE];

    public int getSongCount() {
        return songCount;
    }

    public Disc(String discName, Song[] songs) {
        this.discName = discName;
        //!! check
        //check into setter
        setSongs(songs);
    }

    public Disc(String discName, int songCount) {
        this.discName = discName;
        if (songCount > 0) this.songs = new Song[songCount];
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public Song[] getSongs() {
        return songs;
    }

//!! check
    public void setSongs(Song[] songs) {

        if (songs.length > 0) this.songs = songs;
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] == null) songCount = i;
        }

    }

    public boolean addSong(Song s) {
        if (songCount < songs.length) {
            songs[songCount++] = s;
            return true;
        } else return false;
    }
//    public boolean exist (String nSong, String pSong){
//        for (int i = 0; i < songCount; i++) {
//            if(songs[i].getName().equalsIgnoreCase(nSong) && songs[i].getPerformer().equalsIgnoreCase(pSong)) return true;
//        }
//        return false;
//    }

    public boolean exist(String nSong, String pSong) {
        for (Song s : songs) {
            if (s != null && s.getName().equalsIgnoreCase(nSong) && s.getPerformer().equalsIgnoreCase(pSong))
                return true;
        }
        return false;
    }
}
