package Bridge;


public class Main {
    Shape square = new Square(new Blue());
}

interface Color {
    String fill();
}

class Blue implements Color {
    @Override
    public String fill() {
        return "Color is Blue";
    }
}

abstract class Shape {
    protected Color color;

    //standard constructors

    abstract public String draw();
}

class Square extends Shape {

    public Square(Color color) {
//        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
