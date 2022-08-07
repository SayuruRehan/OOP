// Rectangle.java
// Lecture 02 - Slide Deck
// Simple Rectangle Class with setters and getters
// IT2030 - Object Oriented Programming
// (c) SLIIT 2018

class Rectangle {
    // private:
    private int width;
    private int length;

    // public
    public void setWidth(int w) {
        if (w > 0)
           width = w;
        else
           width = 10;
    }

    public void setLength(int l) {
        if (l > 0)
            length = l;
        else
            length = 10;
    }

    public int area() {
        return length * width;
    }
}

public class Main {
    public static void main(String args[]) {
        Rectangle a,b;
        a = new Rectangle();
        b = new Rectangle();

        a.setWidth(30);
        a.setLength(100);
        b.setWidth(20);
        b.setLength(50);
        int total = a.area()- b.area();

        System.out.println("Area is " + total);
    }
}  