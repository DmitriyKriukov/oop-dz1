import java.util.Random;

public class Car {
    /*
    Напишите класс Car.
              В классе должна храниться следующая информация:
            название автомобиля  - model;
            год выпуска - year;
            стоимость - price;
            цвет - color;
            объем двигателя - power.

            Добавьте в класс Car метод getInfo без параметров,
            который будет печать на экране значения полей объекта класса  model , power и year.

            Доработайте класс Car.
               В классе должна храниться следующая информация:
            Свойство - которое говорит заведен авто или нет
            Метод - запуска автомобиля
            Метод - остановки автомобиля
            Метод дороги - при вызове, в качестве аргумента передаем место назначения
            И если авто заведён - выводим, что мы на такой-то авто едем место назначения
            Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
    */
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;
    int maxSpeed;

    Car(String model, int year, double price, String color, int power, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
        this.maxSpeed = maxSpeed;
    }

    public void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power + " " + maxSpeed);
    }

    public void powerCare() {
        this.status = true;
        System.out.println("Автомобиль заведен");
    }

    public void stopCar() {
        this.status = false;
        System.out.println("Автомобиль остановлен");
    }

    public void road(String adress) {
        if (!status) {
            System.out.println("Автомобиль не заведен, мы не можем ехать");
        } else {
            System.out.println("Мы едем по адресу: " + adress);
        }
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
