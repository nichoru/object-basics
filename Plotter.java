
/**
 * Write a description of class Plotter here.
 *
 * @author Rune Nicholson
 * @version 16/02/2023
 */
public class Plotter
{
    Coordinate point;
    
    public Plotter()
    {
        point = new Coordinate();
        System.out.println("Coordinate location is: " + point.x + ", " + point.y);
        
        point.x = 5;
        point.y = 7;
        System.out.println("Coordinate location is: " + point.x + ", " + point.y);
    }
}
