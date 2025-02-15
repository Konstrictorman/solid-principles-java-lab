interface Drivable {
    void drive();
}

interface Refuelable {
    void refuel();
}

interface Rechargeable {
    void recharge();
}

class Car implements Drivable, Refuelable {
    @Override
    public void drive() {
        System.out.println("Conduciendo...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando...");
    }
}

class ElectricCar implements Drivable, Rechargeable {
    @Override
    public void drive() {
        System.out.println("Conduciendo...");
    }

    @Override
    public void recharge() {
        System.out.println("Cargando batería...");
    }
}
