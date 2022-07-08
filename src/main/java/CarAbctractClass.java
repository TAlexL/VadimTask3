public abstract class CarAbctractClass {

    int speed;
    int engineVolum;
    String nameOfCar;
    String fuel;

    public void infoAboutCarMethod(int speed,int engineVolum, String nameOfCar, String fuel ){
        System.out.print("This is my car. Car's name is " + nameOfCar + ". Car have " + engineVolum + " on " + fuel + " and speed " + speed + " km/h");
    }

    public abstract int distanceMethod();
}
