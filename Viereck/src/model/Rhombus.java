package model;

import resource.RhombusKonstanten;

/**
 * @version 21.12.2019
 * @author jakob
 */
public class Rhombus extends Parallelogram
{
 public Rhombus ()
    {
        super(RhombusKonstanten.DEFAULT_WERT_XA, RhombusKonstanten.DEFAULT_WERT_YA, RhombusKonstanten.DEFAULT_WERT_XB, RhombusKonstanten.DEFAULT_WERT_YB, RhombusKonstanten.DEFAULT_WERT_XC, RhombusKonstanten.DEFAULT_WERT_YC, RhombusKonstanten.DEFAULT_WERT_XD, RhombusKonstanten.DEFAULT_WERT_YD);
    }

    public Rhombus (Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        super(punktA, punktB, punktC, punktD);
    }

    public Rhombus (double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        super(xA, yA, xB, yB, xC, yC, xD, yD);

    }
    
    @Override
    public boolean pruefeRichtigkeitDerEigenschaften ()
    {
                boolean ergebnis = false;

        if (this.getKanteAB().getLAENGE() == this.getKanteBC().getLAENGE() && this.getKanteAB().getLAENGE() == this.getKanteCD().getLAENGE() && this.getKanteAB().getLAENGE() == this.getKanteDA().getLAENGE())
        {
            if (this.getKanteAB().getSTEIGUNG() == this.getKanteCD().getSTEIGUNG() && this.getKanteBC().getSTEIGUNG() == this.getKanteDA().getSTEIGUNG())
            {
                ergebnis = true;
            }
        }

        return ergebnis;
    }
}
