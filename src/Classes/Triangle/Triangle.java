public class Triangle {
    static int numOfSides = 3;
    
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // constructor with properties(attributes)
    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // method
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
