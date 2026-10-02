/**
 * Parte 2: Herencia y sobreescritura (displayInfo).
 * Parte 3: Sobrecarga del constructor (con parámetro adicional range).
 * Tipo de clase: subclase (clase derivada) de Vehicle.
 */
public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;
    private int range;

    // Constructor original (Parte 2)
    public ElectricVehicle(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    // Constructor sobrecargado con range (Parte 3)
    public ElectricVehicle(String brand, String model, double price, double batteryCapacity, int range) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    // Sobreescritura del método de la superclase
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayRange() {
        System.out.println("Range: " + range + " km");
    }
}
