package model;

import resource.RechteckKonstanten;

/**
 * @version 21.12.2019
 * @author jakob
 */
public class Rechteck extends Parallelogram
{

    public Rechteck ()
    {
        super(RechteckKonstanten.DEFAULT_WERT_XA, RechteckKonstanten.DEFAULT_WERT_YA, RechteckKonstanten.DEFAULT_WERT_XB, RechteckKonstanten.DEFAULT_WERT_YB, RechteckKonstanten.DEFAULT_WERT_XC, RechteckKonstanten.DEFAULT_WERT_YC, RechteckKonstanten.DEFAULT_WERT_XD, RechteckKonstanten.DEFAULT_WERT_YD);
    }

    public Rechteck (Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        super(punktA, punktB, punktC, punktD);
    }

    public Rechteck (double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        super(xA, yA, xB, yB, xC, yC, xD, yD);

    }

    @Override 
    public boolean pruefeRichtigkeitDerEigenschaften ()
    {
        boolean ergebnis = false;

        if (this.getKanteAB().getLAENGE() == this.getKanteCD().getLAENGE() && this.getKanteBC().getLAENGE() == this.getKanteDA().getLAENGE())
        {
            if (this.getKanteAB().getSTEIGUNG() == this.getKanteCD().getSTEIGUNG() && this.getKanteBC().getSTEIGUNG() == this.getKanteDA().getSTEIGUNG())
            {
                if ((((Math.pow(this.getKanteAB().getLAENGE(), 2.0))) + ((Math.pow(this.getKanteBC().getLAENGE(), 2.0))) == ((double)((int)((Math.pow(this.getDiagonaleAC().getLAENGE(), 2.0) + 1))))) && ((Math.pow(this.getKanteDA().getLAENGE(), 2.0))) + ((Math.pow(this.getKanteCD().getLAENGE(), 2.0))) == ((double)((int)((Math.pow(this.getDiagonaleBD().getLAENGE(), 2.0) + 1)))))
                {
                    ergebnis = true;
                }
            }
        }

        return ergebnis;
    }
}
