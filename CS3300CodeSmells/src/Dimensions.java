public class Dimensions {
    private int length;
    private int width;
    private int height;
    
    public Dimensions(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return length * width * height;
    }
}
