package thefifth;

class Box implements Comparable<Box> {
    private int length, width, height;

    public boolean isLargerThan(Box otherBox) {
        return (this.length > otherBox.length) || (this.width > otherBox.width) || (this.height > otherBox.height);
    }
}