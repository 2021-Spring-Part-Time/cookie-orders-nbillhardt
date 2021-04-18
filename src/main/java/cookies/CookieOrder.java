package cookies;

public class CookieOrder {
    private int numBoxes;
    private String variety;

    public CookieOrder(String variety, int numBoxes) {
        this.numBoxes = numBoxes;
        this.variety = variety;
    }

    public int getNumberOfBoxes() {
        return this.numBoxes;
    }

    public String getVariety() {
        return this.variety;
    }
}
