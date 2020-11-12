package model;

/**
 * @version 21.12.2019
 * @author jakob
 */
public class KonvexesViereck extends Viereck
{
    
    public KonvexesViereck ()
    {
        super(resource.KonvexesViereckKonstanten.DEFAULT_WERT_XA, resource.KonvexesViereckKonstanten.DEFAULT_WERT_YA, resource.KonvexesViereckKonstanten.DEFAULT_WERT_XB, resource.KonvexesViereckKonstanten.DEFAULT_WERT_YB, resource.KonvexesViereckKonstanten.DEFAULT_WERT_XC, resource.KonvexesViereckKonstanten.DEFAULT_WERT_YC, resource.KonvexesViereckKonstanten.DEFAULT_WERT_XD, resource.KonvexesViereckKonstanten.DEFAULT_WERT_YD);
    }
    
    public KonvexesViereck (Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        super(punktA, punktB, punktC, punktD);
    }
    
       public KonvexesViereck (double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        super(xA, yA, xB, yB, xC, yC, xD, yD);
       
    } 
       
    @Override
    public boolean pruefeRichtigkeitDerEigenschaften ()
    {
        boolean ergebnis = true;
        
        if(this.getPunktA().getX() > this.getPunktB().getX() || this.getPunktD().getX() > this.getPunktC().getX())
        {
            ergebnis = false;
        }
        else if(this.getPunktA().getY() > this.getPunktD().getY() || this.getPunktB().getY() > this.getPunktC().getY())
        {
            ergebnis = false;
        }       
        
        return ergebnis;
    }
    
}
