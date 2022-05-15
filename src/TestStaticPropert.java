public class TestStaticProperty {



    public static void main(String[] args) {

        CarStatic car1 = new CarStatic("Mazda 3","Skyactiv 3");

        System.out.println(CarStatic.numberOfCars);

        CarStatic car2 = new CarStatic("Mazda 6","Skyactiv 6");

        System.out.println(CarStatic.numberOfCars);

    }

}