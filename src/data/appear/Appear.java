package data.appear;

public class Appear {
    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return  "("+word +" : " + count+")";
    }

    private int count;

    public Appear(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
