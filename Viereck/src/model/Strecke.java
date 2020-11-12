package model;

import resource.Strings;

/**
 * @version 02.01.2020
 * @author jakob
 */
public class Strecke 
{
 
    private final Punkt PUNKT_A;
    private final Punkt PUNKT_B;
    private final double LAENGE;
    private final double STEIGUNG;
    
    protected Strecke (Punkt PUNKT_A, Punkt PUNKT_B)
    {
        this.PUNKT_A = PUNKT_A;
        this.PUNKT_B = PUNKT_B;
        this.LAENGE = berechneLaenge();
        this.STEIGUNG = berechneSteigung();
    }
    
    private double berechneLaenge ()
    {
        double ergebnis = Math.sqrt(Math.pow(((this.PUNKT_A.getX()) - (this.PUNKT_B.getX())), 2) + Math.pow(((this.PUNKT_A.getY()) - (this.PUNKT_B.getY())), 2));
        return ergebnis;
    }

    private double berechneSteigung ()
    {
        double ergebnis = ((this.PUNKT_B.getY() - this.PUNKT_A.getY()) / (this.PUNKT_B.getX() - this.PUNKT_A.getX()));
        if(ergebnis == Double.NEGATIVE_INFINITY)
        {
            ergebnis = ergebnis * (-1);
        }
        return ergebnis;
    }

    public Punkt getPUNKT_A ()
    {
        return PUNKT_A;
    }

    public Punkt getPUNKT_B ()
    {
        return PUNKT_B;
    }

    public double getLAENGE ()
    {
        return LAENGE;
    }

    public double getSTEIGUNG ()
    {
        return STEIGUNG;
    }
    
    @Override
    public String toString()
    {
        String ergebnis = Strings.PUNKT_1  + this.getPUNKT_A().toString() + Strings.KOMMA + Strings.PUNKT_2 + this.getPUNKT_B().toString() + Strings.KOMMA + Strings.LAENGE + this.getLAENGE() + Strings.KOMMA + Strings.STEIGUNG + this.getSTEIGUNG();
        return ergebnis;
    }
}
