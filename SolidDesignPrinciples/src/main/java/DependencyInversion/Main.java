package DependencyInversion;


import java.util.List;

public class Main {

}

//    Bad example
class BackEndDeveloper {

    public void writeJava() {
    }
}
class FrontEndDeveloper {

    public void writeJavascript() {
    }

}
class Project {

    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement() {

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

}

//        Good example
interface Developer {

    void develop();
}

class BackEndDeveloper1 implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    }

}

class FrontEndDeveloper1 implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
    }

}

class Project1 {

    private List<Developer> developers;

    public Project1(List<Developer> developers) {

        this.developers = developers;
    }

    public void implement() {

        developers.forEach(Developer::develop);
    }

}