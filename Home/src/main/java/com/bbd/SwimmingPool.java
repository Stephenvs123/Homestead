package com.bbd;

public class SwimmingPool {
    private final int length;
    private final int width;
    private final int depth;
    private final int volume;

    public SwimmingPool(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.volume = length*width*depth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
    public  int getVolume(){

        return length*width*depth;
    }
    @Override
    public String toString() {
        return "SwimmingPool{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", volume=" + volume +
                '}';
    }
}
