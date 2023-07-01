public class ServiceStation {

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживание велосипеда:");
        bicycle.service();
        System.out.println();
    }

    public void check(Car car) {
        System.out.println("Обслуживание легкового автомобиля:");
        car.service();
        System.out.println();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживание грузового автомобиля:");
        truck.service();
        System.out.println();
    }

}