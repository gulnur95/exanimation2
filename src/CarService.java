public class CarService {

    private static final int maxCars = 100;
    private Car[] cars = new Car[maxCars];
    private int carCount=0;


    public String createCar(Car car) {
        if (carCount < maxCars) {
            cars[carCount] = car;
            carCount++;
            return "Car added successfully";
        } else {
            return "Size is not available";
        }
    }



    public Car getCarById(long id) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getId() == id) {
                return cars[i];
            }
        }
        return null;
    }


    public Car[] getAll() {
        Car[] currentCars = new Car[carCount];
        for (int i = 0; i < carCount; i++) {
            currentCars[i] = cars[i];
        }
        return currentCars;
    }

















}
