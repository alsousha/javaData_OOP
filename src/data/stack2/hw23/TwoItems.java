package data.stack2.hw23;

public class TwoItems {
    private int num1;
    private int num2;

    public TwoItems(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "TwoItems{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
