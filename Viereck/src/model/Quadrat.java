package model;

import resource.QuadratKonstanten;

/**
 * @version 21.12.2019
 * @author jakob
 */
public class Quadrat extends Parallelogram implements RhombusInterface , RechteckInterface
{
    
    public Quadrat ()
    {
        super(QuadratKonstanten.DEFAULT_WERT_XA, QuadratKonstanten.DEFAULT_WERT_YA, QuadratKonstanten.DEFAULT_WERT_XB, QuadratKonstanten.DEFAULT_WERT_YB, QuadratKonstanten.DEFAULT_WERT_XC, QuadratKonstanten.DEFAULT_WERT_YC, QuadratKonstanten.DEFAULT_WERT_XD, QuadratKonstanten.DEFAULT_WERT_YD);
    }

    public Quadrat (Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        super(punktA, punktB, punktC, punktD);
    }

    public Quadrat (double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        super(xA, yA, xB, yB, xC, yC, xD, yD);

    }
    
@Override
public boolean pruefeRichtigkeitDerEigenschaften ()
{
    boolean ergebnis = false;
    
    if(pruefeRichtigkeitDerRhombusEigenschaften(this.getKanteAB(), this.getKanteBC(), this.getKanteCD(), this.getKanteDA()) && pruefeRichtigkeitDerRechteckEigenschaften(this.getKanteAB(), this.getKanteBC(), this.getKanteCD(), this.getKanteDA(), this.getDiagonaleAC(), this.getDiagonaleBD()))
    {
        ergebnis = true;
    }
    
    return ergebnis;
}

}
