package control;

import model.Flaeche;
import model.KonvexesViereck;
import model.Parallelogram;
import model.Quadrat;
import model.Rechteck;
import model.Rhombus;
import model.Trapez;
import resource.Strings;
import model.DefaultViereck;
import utility.Eingabe;
import static utility.Eingabe.gebeVierecksPunktEin;
import view.Ausgabe;

/**
 * @version 22.12.2019
 * @author jakob
 */
public class Main
{

    private static Flaeche meinViereck = new DefaultViereck();
    private static int gewaehlteViereckNummer = 0;
    private static int zaehler = 0;
    private static String meinViereckString = null;

    public static void main(String[] args)
    {
        begruesse();
        erstelleViereck();
        praesentiereViereck();
    }

    private static void begruesse()
    {
        Ausgabe.gebeStringAus(Strings.BEGRUESSUNGSTEXT);

    }

    private static void erstelleViereck()
    {
        while (!(meinViereck.pruefeRichtigkeitDerEigenschaften()))
        {
            
            informiereUeberFehlschlag();
            gewaehlteViereckNummer = Eingabe.gebeViereckNummerEin();
            char defaultJaOderNein = 'a';
                        switch (gewaehlteViereckNummer)
            {
                case 1:
                    Ausgabe.gebeStringAus(Strings.GEWAEHLT + Strings.KONVEXES_VIERECK + Strings.KOORDINATEN_ANFORDERN);
                    defaultJaOderNein = Eingabe.gebeCharEin();
                    if(defaultJaOderNein == 'N')
                    {
                        meinViereck = new KonvexesViereck(gebeVierecksPunktEin(Strings.PUNKT_A), gebeVierecksPunktEin(Strings.PUNKT_B), gebeVierecksPunktEin(Strings.PUNKT_C), gebeVierecksPunktEin(Strings.PUNKT_D));
                    }
                    else if (defaultJaOderNein == 'J')
                    {
                        meinViereck = new KonvexesViereck();
                    }
                    meinViereckString = Strings.KONVEXES_VIERECK;
                    
                    break;

                case 2:
                    Ausgabe.gebeStringAus(Strings.GEWAEHLT + Strings.TRAPEZ + Strings.KOORDINATEN_ANFORDERN);
                    defaultJaOderNein = Eingabe.gebeCharEin();
                    if(defaultJaOderNein == 'N')
                    {
                    meinViereck = new Trapez(gebeVierecksPunktEin(Strings.PUNKT_A), gebeVierecksPunktEin(Strings.PUNKT_B), gebeVierecksPunktEin(Strings.PUNKT_C), gebeVierecksPunktEin(Strings.PUNKT_D));
                    }
                    else if(defaultJaOderNein == 'J')
                    {
                        meinViereck = new Trapez();
                    }
                    meinViereckString = Strings.TRAPEZ;
                    break;

                case 3:
                    Ausgabe.gebeStringAus(Strings.GEWAEHLT + Strings.PARALLELOGRAM + Strings.KOORDINATEN_ANFORDERN);
                    defaultJaOderNein = Eingabe.gebeCharEin();
                    if(defaultJaOderNein == 'N')
                    {
                    meinViereck = new Parallelogram(gebeVierecksPunktEin(Strings.PUNKT_A), gebeVierecksPunktEin(Strings.PUNKT_B), gebeVierecksPunktEin(Strings.PUNKT_C), gebeVierecksPunktEin(Strings.PUNKT_D));
                    }
                    else if(defaultJaOderNein == 'J')
                    {
                        meinViereck = new Parallelogram();
                    }
                    meinViereckString = Strings.PARALLELOGRAM;
                    break;

                case 4:
                    Ausgabe.gebeStringAus(Strings.GEWAEHLT + Strings.RHOMBUS + Strings.KOORDINATEN_ANFORDERN);
                    defaultJaOderNein = Eingabe.gebeCharEin();
                    if(defaultJaOderNein == 'N')
                    {
                    meinViereck = new Rhombus(gebeVierecksPunktEin(Strings.PUNKT_A), gebeVierecksPunktEin(Strings.PUNKT_B), gebeVierecksPunktEin(Strings.PUNKT_C), gebeVierecksPunktEin(Strings.PUNKT_D));
                    }
                    else if(defaultJaOderNein == 'J')
                    {
                        meinViereck = new Rhombus();
                    }
                    meinViereckString = Strings.RHOMBUS;
                    break;

                case 5:
                    Ausgabe.gebeStringAus(Strings.GEWAEHLT + Strings.RECHTECK + Strings.KOORDINATEN_ANFORDERN);
                    defaultJaOderNein = Eingabe.gebeCharEin();
                    if(defaultJaOderNein == 'N')
                    {
                    meinViereck = new Rechteck(gebeVierecksPunktEin(Strings.PUNKT_A), gebeVierecksPunktEin(Strings.PUNKT_B), gebeVierecksPunktEin(Strings.PUNKT_C), gebeVierecksPunktEin(Strings.PUNKT_D));
                    }
                    else if(defaultJaOderNein == 'J')
                    {
                        meinViereck = new Rechteck();
                    }
                    meinViereckString = Strings.RECHTECK;
                    break;

                case 6:
                    Ausgabe.gebeStringAus(Strings.GEWAEHLT + Strings.QUADRAT + Strings.KOORDINATEN_ANFORDERN);
                    defaultJaOderNein = Eingabe.gebeCharEin();
                    if(defaultJaOderNein == 'N')
                    {
                    meinViereck = new Quadrat(gebeVierecksPunktEin(Strings.PUNKT_A), gebeVierecksPunktEin(Strings.PUNKT_B), gebeVierecksPunktEin(Strings.PUNKT_C), gebeVierecksPunktEin(Strings.PUNKT_D));
                    }
                    else if(defaultJaOderNein == 'J')
                    {
                        meinViereck = new Quadrat();
                    }
                    meinViereckString = Strings.QUADRAT;
                    break;

                default:
                    Ausgabe.gebeStringAus(Strings.UNGUELTIG);
                    break;

            }
        }
    }
    
    private static void informiereUeberFehlschlag ()
    {
            zaehler = zaehler + 1;
            if(zaehler > 1)
            {
                Ausgabe.gebeStringAus(Strings.HAT_NICHT_GEKLAPPT);
            }
    }
    
    private static void praesentiereViereck()
    {
        Ausgabe.gebeStringAus(Strings.SIE_HABEN + meinViereckString + Strings.SIE_HABEN_2 + meinViereck.toString());
    }
    
}
