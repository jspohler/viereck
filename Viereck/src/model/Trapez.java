package model;

import resource.TrapezKonstanten;

/**
 * @version 21.12.2019
 * @author jakob
 */
public class Trapez extends KonvexesViereck
{
    
    public Trapez ()
    {
        super(TrapezKonstanten.DEFAULT_WERT_XA, TrapezKonstanten.DEFAULT_WERT_YA, TrapezKonstanten.DEFAULT_WERT_XB, TrapezKonstanten.DEFAULT_WERT_YB, TrapezKonstanten.DEFAULT_WERT_XC, TrapezKonstanten.DEFAULT_WERT_YC, TrapezKonstanten.DEFAULT_WERT_XD, TrapezKonstanten.DEFAULT_WERT_YD);
    }
    
    public Trapez (Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        super(punktA, punktB, punktC, punktD);
    }
    
    public Trapez (double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        super(xA, yA, xB, yB, xC, yC, xD, yD);
        
    }
    
    
    @Override
    public boolean pruefeRichtigkeitDerEigenschaften ()
    {
        boolean ergebnis = false;
        
        if(this.getKanteAB().getSTEIGUNG() == this.getKanteCD().getSTEIGUNG() || this.getKanteBC().getSTEIGUNG() == this.getKanteDA().getSTEIGUNG())
        {
            ergebnis = true;
        }
        
        return ergebnis;
    }
    
}
