package model;

/**
 * @version 22.12.2019
 * @author jakob
 */
public interface RhombusInterface
{
    default boolean pruefeRichtigkeitDerRhombusEigenschaften (Strecke kanteAB, Strecke kanteBC, Strecke kanteCD, Strecke kanteDA)
    {
                boolean ergebnis = false;

        if (kanteAB.getLAENGE() == kanteBC.getLAENGE() && kanteAB.getLAENGE() == kanteCD.getLAENGE() && kanteAB.getLAENGE() == kanteDA.getLAENGE())
        {
            if (kanteAB.getSTEIGUNG() == kanteCD.getSTEIGUNG() && kanteBC.getSTEIGUNG() == kanteDA.getSTEIGUNG())
            {
                ergebnis = true;
            }
        }

        return ergebnis;
    }
}
