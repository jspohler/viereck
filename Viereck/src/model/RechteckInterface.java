package model;

/**
 * @version 22.12.2019
 * @author jakob
 */
public interface RechteckInterface 
{
    default boolean pruefeRichtigkeitDerRechteckEigenschaften (Strecke kanteAB, Strecke kanteBC, Strecke kanteCD, Strecke kanteDA, Strecke diagonaleAC, Strecke diagonaleBD)
    {
        boolean ergebnis = false;
        
        if (kanteAB.getLAENGE() == kanteCD.getLAENGE() && kanteBC.getLAENGE() == kanteDA.getLAENGE())
        {
            if (kanteAB.getSTEIGUNG() == kanteCD.getSTEIGUNG() && kanteBC.getSTEIGUNG() == kanteDA.getSTEIGUNG())
            {
                if (((Math.pow(kanteAB.getLAENGE(), 2)) + (Math.pow(kanteBC.getLAENGE(), 2)) == ((double)((int)(Math.pow(diagonaleAC.getLAENGE(), 2))))) && (Math.pow(kanteDA.getLAENGE(), 2)) + (Math.pow(kanteCD.getLAENGE(), 2)) == ((double)((int)(Math.pow(diagonaleBD.getLAENGE(), 2)))))
                {
                    ergebnis = true;
                }
            }
        }

        return ergebnis;
    }
}
