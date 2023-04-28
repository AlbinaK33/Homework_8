package main.java;

abstract class Shape {
    public abstract String getName();


}


class Circle extends Shape {
    private static final String NAME = "Circle";
    @Override
    public String getName() {
        return NAME;
    }
}

class Quad extends Shape {
    private static final String NAME = "Quad";
    @Override
    public String getName() {
        return NAME;
    }
}

class Diamond extends Shape {
    private static final String NAME = "Diamond";
    @Override
    public String getName() {
        return NAME;
    }
}

class Triangle extends Shape {
    private static final String NAME = "Triangle";
    @Override
    public String getName() {
        return NAME;
    }
}

class Oval extends Shape {
    private static final String NAME = "Oval";
    @Override
    public String getName() {
        return NAME;
    }
}

class ShapePrint {
    public void printName(Shape shape) {
        System.out.println(shape.getName());
    }

    public static void main(String[] args) {

        ShapePrint shapePrint = new ShapePrint();
        shapePrint.printName(new Quad());
    }
}


