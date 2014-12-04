package ships;

import java.util.Date;
import java.util.Random;

public class MissileBoat extends Sea
{
    int x;
    int y;
    Random repartition = new Random((new Date()).getTime());

    void placeMissileBoat()
    {
        x = repartition.nextInt(9) + 1;
        y = repartition.nextInt(9) + 1;
        while (sheet[x][y] == 1)
        {
            placeMissileBoat();
        }
    }
    
    void markPosition()
    {
        sheet[x][y] = 1;
    }
    
    void supervisor()
    {
        System.out.println("Wartość zaznaczenia na mapie to: " + sheet[x][y]);
    }
}
