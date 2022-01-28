package LiskovSubstitution;


public class Main {

}

//    Bad example
class Bird{
    public void fly(){}
}
class Duck extends Bird{}
    //The duck can fly because it is a bird, but what about this:
class Ostrich extends Bird{}





//        Good example
class Bird1{}
class FlyingBirds extends Bird1{
    public void fly(){}
}
class Duck1 extends FlyingBirds{}
class Ostrich1 extends Bird1{}