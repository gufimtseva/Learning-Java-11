public class TriangleMain {

    public static void main(String[] args) {
        // triangle inctances triangleA, triangleB
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

        // using an Inctance method findArea()
        double triangleAArea = triangleA.findArea();         // Triangle.findArea() --> Math.pow(2,3)?
        System.out.println("Area of triangleA is " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("Area of triangleB is " + triangleBArea);

        // access to Non-static instance variables(attributes)
        System.out.println("\nsideLenThree of triangleA is " +  triangleA.sideLenThree);
        System.out.println("base of triangleB is " +  triangleB.base);

        // access to Static class variables
        System.out.println("\nnumber of triangle sides equals " +  Triangle.numOfSides);
    }

}
