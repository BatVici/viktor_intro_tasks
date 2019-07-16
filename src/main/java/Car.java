import java.awt.*;
import java.time.LocalDate;

abstract class Car {

    String modelName;
    int maxSpeed;
    Color color;
    LocalDate productionDate;


    public Car(String modelName,int maxSpeed,Color color,LocalDate productionDate){

        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.productionDate = productionDate;

    }
}