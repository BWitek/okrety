package ships;

import java.util.Date;
import java.util.Random;

public class Frigate extends Sea
{
    int x1;
    int y1;
    int x2;
    int y2;
    Random repartition = new Random((new Date()).getTime());
    Random direction = new Random();
    boolean dir = direction.nextBoolean();
    void placeFrigate()
    {
        x1 = repartition.nextInt(9) + 1;
        y1 = repartition.nextInt(9) + 1;
        if (dir)
        {
            if (dir)
            {
                x2 = x1;
                y2 = y1 + 1;
                if (y2 > 10)
                {
                    y2 = y1 - 1;
                }
            }
            else 
            {
                x2 = x1;
                y2 = y1 - 1;
                if (y2 < 0)
                {
                    y2 = y1 + 1;
                }
            }
        }           
        
        else
        {
           if (dir)
            {
                x2 = x1 + 1;
                y2 = y1;
                if (x2 > 10)
                {
                    x2 = x1 - 1;
                }
            }
            else 
            {
                x2 = x1 - 1;
                y2 = y1;
                if (x2 < 0)
                {
                    x2 = x1 + 1;
                }
            } 
        }
    }
}

