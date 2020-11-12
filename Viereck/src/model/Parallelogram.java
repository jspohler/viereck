package model;

import resource.ParallelogramKonstanten;

/**
 * @version 21.12.2019
 * @author jakob
 */
public class Parallelogram extends Trapez
{

    public Parallelogram ()
    {
        super(ParallelogramKonstanten.DEFAULT_WERT_XA, ParallelogramKonstanten.DEFAULT_WERT_YA, ParallelogramKonstanten.DEFAULT_WERT_XB, ParallelogramKonstanten.DEFAULT_WERT_YB, ParallelogramKonstanten.DEFAULT_WERT_XC, ParallelogramKonstanten.DEFAULT_WERT_YC, ParallelogramKonstanten.DEFAULT_WERT_XD, ParallelogramKonstanten.DEFAULT_WERT_YD);
    }

    public Parallelogram (Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        super(punktA, punktB, punktC, punktD);
    }

    public Parallelogram (double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
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
                ergebnis = true;
            }
        }

        return ergebnis;
    }
}
