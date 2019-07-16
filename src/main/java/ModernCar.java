import java.awt.*;
import java.time.LocalDate;

abstract class ModernCar extends Car {
    int weight;
    int seats;


    public ModernCar(String modelName, int maxSpeed, Color color, LocalDate productionDate,int weight,int seats) {
        super(modelName, maxSpeed, color, productionDate);
        this.weight = weight;
        this.seats = seats;
    }
}