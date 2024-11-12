import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Car car1 = new Car(1, "Model A", "Mercedes", 76.999, LocalDate.of(2023, 12, 4), CarType.HATCHBACK);
        Car car2 = new Car(2, "Model B", "BMW" , 88.999, LocalDate.of(2022, 8,6),CarType.SEDAN);

        System.out.println("Create Method");
        System.out.println(carService.createCar(car1));
        System.out.println(carService.createCar(car2));


        System.out.println("\nMethod getByID");
       carService.getCarById(1);
        System.out.println(car1);



        System.out.println("\n Method getAllID:");
        for (Car car : carService.getAll()) {
            System.out.println(car);
        }







    }
}