import java.util.Arrays;

public class GreyscaleGrid implements Measurable {
    private int[][] pixels;
    private int width, height;

    public GreyscaleGrid(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width][height];
        fillRandom();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "GreyscaleGrid{" +
                "width=" + width + " height=" + height +
                '}';
    }

    @Override
    public double getSize() {
        int sum = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sum += pixels[i][j];
            }
        }
        return (double) sum / (width*height);
    }

    private void fillRandom() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[i][j] = (int)(Math.random()*256);
            }
        }
    }
}
