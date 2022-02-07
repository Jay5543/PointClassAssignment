package org.WalkerCC_CompSci;

class Point {
    private double x = 0;
    private double y = 0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void FlipVertical() {
        this.x = this.x * -1;
    }

    public void FlipHorizontal() {
        this.x = this.x * -1;
    }

    public void Translate(double xChange, double yChange){
        this.x = this.x + xChange;
        this.y = this.y + yChange;

    }

}
