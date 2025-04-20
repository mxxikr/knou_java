package theeighth;

class Box implements Cloneable {
    private int width, height;

    public Box(int w, int h) {
        width = w;
        height = h;
    }

    public int width( ) {
        return width;
    }

    public int height( ) {
        return height;
    }

    public Object clone( ) {
        try {
            return super.clone( );
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}