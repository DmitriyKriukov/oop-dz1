import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("polo", 2010, 20.2, "red", 50, 190);
        car.getInfo();
        car.road("Магадан");
        car.powerCare();
        car.road("Магадан");
        car.stopCar();
        Car car2 = new Car("golf", 2012, 25, "silver", 65, 180);
        resultRace(car, car2, race(car.getMaxSpeed()), race(car2.getMaxSpeed()));
    }

    public static double race(int maxSpeed) {
        int dist = 0;
        double time = 0;
        while (dist <= 1000) {
            Random random = new Random();
            int speed = random.nextInt(maxSpeed);
            time += speed / 100.0;
            dist += 100;
        }
        return time;
    }

    public static void resultRace(Car car, Car car2, double time, double time2) {
        System.out.println("В гонке на 1000 м учавствуют " + car.getModel() + " и " + car2.getModel());
        System.out.println(car.getModel() + " проехал за: " + time + " сек");
        System.out.println(car2.getModel() + " проехал за: " + time2 + " сек");
        if (time < time2) {
            System.out.println("Выиграл " + car.getModel());
        } else if (time2 < time) {
            System.out.println("Выиграл " + car2.getModel());
        } else {
            System.out.println("Фотофиниш не реализован");
        }
    }
}
