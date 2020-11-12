package model;

import resource.Strings;

/**
 * @version 21.12.2019
 * @author jakob
 */
public abstract class Viereck implements Flaeche
{

    private Punkt punktA = null;
    private Punkt punktB = null;
    private Punkt punktC = null;
    private Punkt punktD = null;

    private Strecke kanteAB = null;
    private Strecke kanteBC = null;
    private Strecke kanteCD = null;
    private Strecke kanteDA = null;

    private Strecke diagonaleAC = null;
    private Strecke diagonaleBD = null;

    public Viereck()
    {
        initialisiereObjektMitWerten(resource.ViereckKonstanten.DEFAULT_WERT_XA, resource.ViereckKonstanten.DEFAULT_WERT_YA, resource.ViereckKonstanten.DEFAULT_WERT_XB, resource.ViereckKonstanten.DEFAULT_WERT_YB, resource.ViereckKonstanten.DEFAULT_WERT_XC, resource.ViereckKonstanten.DEFAULT_WERT_YC, resource.ViereckKonstanten.DEFAULT_WERT_XD, resource.ViereckKonstanten.DEFAULT_WERT_YD);

    }

    public Viereck(Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        initialisiereObjektMitPunkten(punktA, punktB, punktC, punktD);

    }

    public Viereck(double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        initialisiereObjektMitWerten(xA, yA, xB, yB, xC, yC, xD, yD);

    }
    

    public final Punkt getPunktA()
    {
        return this.punktA;
    }

    public void setPunktA(Punkt punktA)
    {
        this.punktA = punktA;
    }

    public final Punkt getPunktB()
    {
        return this.punktB;
    }

    public void setPunktB(Punkt punktB)
    {
        this.punktB = punktB;
    }

    public final Punkt getPunktC()
    {
        return this.punktC;
    }

    public void setPunktC(Punkt punktC)
    {
        this.punktC = punktC;
    }

    public final Punkt getPunktD()
    {
        return this.punktD;
    }

    public void setPunktD(Punkt punktD)
    {
        this.punktD = punktD;
    }

    public Strecke getKanteAB()
    {
        return this.kanteAB;
    }

    public Strecke getKanteBC()
    {
        return this.kanteBC;
    }

    public Strecke getKanteCD()
    {
        return this.kanteCD;
    }

    public Strecke getKanteDA()
    {
        return this.kanteDA;
    }

    public Strecke getDiagonaleAC()
    {
        return this.diagonaleAC;
    }

    public Strecke getDiagonaleBD()
    {
        return this.diagonaleBD;
    }

    private void initialisiereObjektMitPunkten(Punkt punktA, Punkt punktB, Punkt punktC, Punkt punktD)
    {
        this.setPunktA(punktA);
        this.setPunktB(punktB);
        this.setPunktC(punktC);
        this.setPunktD(punktD);
        berechneKanten();
        berechneDiagonalen();
    }

    private void initialisiereObjektMitWerten(double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD)
    {
        this.setPunktA(new Punkt(xA, yA));
        this.setPunktB(new Punkt(xB, yB));
        this.setPunktC(new Punkt(xC, yC));
        this.setPunktD(new Punkt(xD, yD));
        berechneKanten();
        berechneDiagonalen();
    }

    private void berechneKanten()
    {
        this.kanteAB = new Strecke(this.punktA, this.punktB);
        this.kanteBC = new Strecke(this.punktB, this.punktC);
        this.kanteCD = new Strecke(this.punktC, this.punktD);
        this.kanteDA = new Strecke(this.punktD, this.punktA);
    }

    private void berechneDiagonalen()
    {
        this.diagonaleAC = new Strecke(this.punktA, this.punktC);
        this.diagonaleBD = new Strecke(this.punktB, this.punktD);
    }
    
    
    @Override
    public boolean pruefeRichtigkeitDerEigenschaften ()
    {
        boolean ergebnis = false;
        return ergebnis;
    }
    
    @Override
    public String toString()
    {
        String ergebnis = Strings.PUNKT_A + this.getPunktA().toString() + Strings.KOMMA + Strings.PUNKT_B + this.getPunktB().toString() 
        + Strings.KOMMA + Strings.PUNKT_C + this.getPunktC().toString() + Strings.KOMMA + Strings.PUNKT_D + this.getPunktD().toString() + Strings.NEUE_ZEILE
        + Strings.KANTE_AB + this.getKanteAB().toString() + Strings.NEUE_ZEILE + Strings.KANTE_BC + this.getKanteBC().toString() + Strings.NEUE_ZEILE
        + Strings.KANTE_CD + this.getKanteCD().toString() + Strings.NEUE_ZEILE + Strings.KANTE_DA + this.getKanteDA().toString() 
        + Strings.NEUE_ZEILE + Strings.DIAGONALE_AC + this.getDiagonaleAC().toString() + Strings.NEUE_ZEILE + Strings.DIAGONALE_BD + this.getDiagonaleBD().toString();
        return ergebnis;
    }
}
