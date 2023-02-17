public class Car {
    String marka;
    String model;
    int year;
    double price;
    String color;
    int power;
    double engineCapacity;
    boolean isEngine;

    public Car(String marka, String model, int year, double price, String color, int power, double engineCapacity) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.isEngine = false;
    }

    public void getInfo() {
        System.out.println("Марка:" + marka + "Модель:" + model + ", год выпуска: " + year + ", цена: " + price +
                ", цвет: " + color + ", мощность двигателя: " + power + ", объём двигателя: " + engineCapacity);
    }

    public void start() {
        this.isEngine = true;
        System.out.println(this.model + " двигатель запущен");
    }

    public void stop() {
        this.isEngine = false;
        System.out.println(this.model + " двигатель остановлен");
    }

    public void road(String place) {
        if (this.isEngine)
            System.out.println(this.model + " двигается в " + place);
        else
            System.out.println(this.model + " двигатель заглушен, машина стоит");
    }

    public static void simile(Car car1, Car car2){
        if (car1.year > car2.year)
            System.out.println(car1.marka + " " + car1.model + " Более свежая модель");
        else
            System.out.println(car2.marka + " " + car2.model + " Более свежая модель");
        if (car1.power > car2.power)
            System.out.println("У " + car1.marka + " " + car1.model + " Двигатель мощнее");
        else
            System.out.println("У " + car2.marka + " " + car2.model + " Двигатель мощнее");
        if (car1.engineCapacity > car2.engineCapacity)
            System.out.println("У " + car1.marka + " " + car1.model + " Объём двигателя больше");
        else
            System.out.println("У " + car2.marka + " " + car2.model + " Объём двигателя больше");
    }

    public void delivery(String place) {
        if (place == "Питер") {
            System.out.println(this.marka + " " + this.model + " заедет за цветами по дороге в " + place);
        }
    }
}