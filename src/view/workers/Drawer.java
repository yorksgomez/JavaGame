package view.workers;

public class Drawer {

    private int width, height;

    public Drawer(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int widthToPercent(int width) {
        return valToPercent(width, this.width);
    }

    public int heightToPercent(int height) {
        return valToPercent(height, this.height);
    }

    public int valToPercent(int val, int max) {
        return val * 100 / max;
    }

    public int widthToVal(int width) {
        return percentToVal(width, this.width);
    }

    public int heightToVal(int height) {
        return percentToVal(height, this.height);
    }

    public int percentToVal(int percent, int max) {
        return percent * max / 100;
    }

    @Override
    public String toString() {
        return "Drawer{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

}
