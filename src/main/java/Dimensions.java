public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private int getWidth(){
        return width;
    }

    private int getHeight(){
        return height;
    }

    private int getDepth(){
        return depth;
    }
}
