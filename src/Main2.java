public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("Тойота", "Avensis", 2021, 12345, "серый", 90, 1.6);
        Car car2 = new Car("Ауди", "A1", 2022, 5363, "зеленый", 75, 1.2);
        Car car3 = new Car("", "", 0,  0, "", 0, 0);
//        Car car3 = new Car(car3.setMarka(),
//                car3.setModel(),
//                car3.setYear(),
//                car3.setPrice(),
//                car3.setColor(),
//                car3.setPower(),
//                car3.setPower(),
//                car3.setEngineCapacity());

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

        car3.setMarka("ВАЗ");
        car3.setModel("2121");
        car3.setYear(2021);
        car3.setPrice(750000);
        car3.setColor("мурена");
        car3.setPower(80);
        car3.setEngineCapacity(1.7);
        car3.getInfo();

    }

}