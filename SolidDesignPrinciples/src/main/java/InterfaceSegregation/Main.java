package InterfaceSegregation;


public class Main {

}

//    Bad example
interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}

//        Good example
 interface BearCleaner {
    void washTheBear();
}

 interface BearFeeder {
    void feedTheBear();
}

 interface BearPetter {
    void petTheBear();
}

class BearCarer implements BearCleaner, BearFeeder {

    public void washTheBear() {
        //I think we missed a spot...
    }

    public void feedTheBear() {
        //Tuna Tuesdays...
    }
}