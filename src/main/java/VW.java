import java.awt.*;
import java.time.LocalDate;

public class VW extends Car {
    public VW(int maxSpeed, Color color, LocalDate productionDate, String modelName) {
        super(modelName,maxSpeed, color, productionDate);
    }
}
