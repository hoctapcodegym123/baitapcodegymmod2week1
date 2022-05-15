public class CarStatic {

    private String name;

    private String engine;


    public static int numberOfCars;


    public CarStatic(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }


    // getters and setters

}
