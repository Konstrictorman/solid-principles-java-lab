import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarDrive() {
        Car car = new Car();
        assertDoesNotThrow(car::drive);
    }

    @Test
    void testCarRefuel() {
        Car car = new Car();
        assertDoesNotThrow(car::refuel);
    }
}

class ElectricCarTest {

    @Test
    void testElectricCarDrive() {
        ElectricCar electricCar = new ElectricCar();
        assertDoesNotThrow(electricCar::drive);
    }

    @Test
    void testElectricCarRecharge() {
        ElectricCar electricCar = new ElectricCar();
        assertDoesNotThrow(electricCar::recharge);
    }
}
