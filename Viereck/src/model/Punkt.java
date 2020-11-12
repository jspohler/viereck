package model;

import resource.Strings;

/**
 * @version 22.12.2019
 * @author jakob
 */
public class Punkt 
{
    private double x = 0.0;
    private double y = 0.0;
    
    public Punkt (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX ()
    {
        return this.x;
    }

    public void setX (double x)
    {
        this.x = x;
    }

    public double getY ()
    {
        return this.y;
    }

    public void setY (double y)
    {
        this.y = y;
    }
    
    @Override
    public String toString()
    {
        String ergebnis = Strings.KLAMMER_AUF + this.getX() + Strings.PIPE + this.getY() + Strings.KLAMMER_ZU;
        return ergebnis;
    }
    
}
