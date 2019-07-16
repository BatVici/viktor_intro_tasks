package

import java.awt.*;
import java.time.LocalDate;

public class JavaTraining {

    public static void main(String[] args) {

        Car mercedes = new Mercedes(250,Color.white,LocalDate.ofYearDay(2010,26),"E300");
        Car vw = new VW(200,Color.black,LocalDate.ofYearDay(2008,16),"GOLF");
        Car opel = new Opel("ASTRA",180,Color.blue,LocalDate.ofYearDay(2000,18),1800,5);
    }

}
