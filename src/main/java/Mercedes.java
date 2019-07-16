import java.awt.*;
import java.time.LocalDate;

public class Mercedes extends Car {
    public Mercedes(int maxSpeed, Color color, LocalDate productionDate, String modelName) {
        super(modelName,maxSpeed, color, productionDate);
    }
}