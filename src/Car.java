public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity system started.");
    }

    private void startCommand() {
        System.out.println("Start command issued.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

