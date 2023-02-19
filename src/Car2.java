public class Car2 {
    String marka;
    String model;
    int year;
    double price;
    String color;
    int power;
    double engineCapacity;
    boolean isEngine;

    public Car2(String marka, String model, int year, double price, String color, int power, double engineCapacity) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.isEngine = false;
    }

    String getMarka() {
        return marka;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    double getPrice() {
        return price;
    }

    String getColor() {
        return color;
    }

    int getPower() {
        return power;
    }

    double getEngineCapacity() {
        return engineCapacity;
    }

    public void setMarka(String marka){
        this.marka = marka;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        if (year < 2020) {
            System.out.println("Год выпуска должен быть не ниже 2020 года!");
            System.exit (1);
        }
        else this.year = year;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void getInfo() {
        System.out.println("Марка: " + getMarka() + ", Модель: " + getModel() + ", год выпуска: " + getYear() +
                ", цена: " + getPrice() + ", цвет: " + getColor() + ", мощность двигателя: " + getPower() +
                ", объём двигателя: " + getEngineCapacity());
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

    public static void simile(Car2 car1, Car2 car2){
        if (car1.getYear() > car2.getYear())
            System.out.println(car1.getMarka() + " " + car1.getModel() + " Более свежая модель");
        else
            System.out.println(car2.getMarka() + " " + car2.getModel() + " Более свежая модель");
        if (car1.getPower() > car2.getPower())
            System.out.println("У " + car1.getMarka() + " " + car1.getModel() + " Двигатель мощнее");
        else
            System.out.println("У " + car2.getMarka() + " " + car2.getModel() + " Двигатель мощнее");
        if (car1.getEngineCapacity() > car2.getEngineCapacity())
            System.out.println("У " + car1.getMarka() + " " + car1.getModel() + " Объём двигателя больше");
        else
            System.out.println("У " + car2.getMarka() + " " + car2.getModel() + " Объём двигателя больше");
    }

    public void delivery(String place) {
        if (place == "Питер") {
            System.out.println(this.marka + " " + this.model + " заедет за цветами по дороге в " + place);
        }
    }
}