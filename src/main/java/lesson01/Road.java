package lesson01;

public class Road implements Overcomable {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    public void overcome(Competitable competitable) {
        competitable.run(length);
    }
}
