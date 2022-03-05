package Decorator;


public class Main {
}

interface ChristmasTree {
    String decorate();
}

class ChristmasTreeImpl implements ChristmasTree {

    @Override
    public String decorate() {
        return "Christmas tree";
    }
}

abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    // standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}


class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
//        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}