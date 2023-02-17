public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Тойота", "Avensis", 2021, 12345, "серый", 90, 1.6);
        Car car2 = new Car("Ауди", "A1", 2022, 5363, "зеленый", 75, 1.2);

        car1.getInfo();
        car2.getInfo();
        car1.start();
        car2.start();
        car1.stop();
        car1.road("Вологда");
        car2.road("Питер");

        car1.delivery("Вологда");
        car2.delivery("Питер");

        Car.simile(car1, car2);
    }

}