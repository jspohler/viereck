package utility;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Punkt;
import resource.Strings;
import view.Ausgabe;

/**
 * @version 02.01.2020
 * @author jakob
 */
public class Eingabe 
{

    public static String gebeWortEin()
    {
        
        Ausgabe.gebeStringAus(resource.Strings.VIERECK_NUMMER_EINGABEAUFFORDERUNG);
        String eingabeString = null;
        
        Scanner scannerEingabeString = new Scanner(System.in);
        eingabeString = scannerEingabeString.next();
        
        return eingabeString;
    }
    
    
        
    public static int gebeViereckNummerEin()
    {
        int eingabeInt = 0;
        while (!(eingabeInt > 0 && eingabeInt < 7))
        {
            try
            {
                Ausgabe.gebeStringAus(resource.Strings.VIERECK_NUMMER_EINGABEAUFFORDERUNG);
                Scanner scannerEingabeZahl = new Scanner(System.in);
                eingabeInt = scannerEingabeZahl.nextInt();
            } catch (InputMismatchException e)
            {
                e.getMessage();
                Ausgabe.gebeStringAus(resource.Strings.UNGUELTIG);
            }
            
        }
        
        return eingabeInt;
    }
    
    public static Punkt gebeVierecksPunktEin (String aktuellerPunkt)
    {
        Punkt ergebnis = null;
        while (ergebnis == null)
        {
            try
            {
                Scanner scannerEingabeZahl = new Scanner(System.in);
                Ausgabe.gebeStringAus(resource.Strings.PUNKT_EINGABEAUFFORDERUNG_X + aktuellerPunkt);
                double x = scannerEingabeZahl.nextDouble();
                Ausgabe.gebeStringAus(resource.Strings.PUNKT_EINGABEAUFFORDERUNG_Y + aktuellerPunkt);
                double y = scannerEingabeZahl.nextDouble();
                ergebnis = new Punkt( x, y);
            } catch (InputMismatchException e)
            {
                e.getMessage();
                Ausgabe.gebeStringAus(resource.Strings.UNGUELTIG);
            }
            
        }
        
        return ergebnis;
    }
    
        public static char gebeCharEin()
    {
        char eingabeChar = '0';
        char[] eingabeCharArray;
        String eingabeString = Strings.KOMMA;
        
        Ausgabe.gebeStringAus(Strings.CHAR_EINGABEAUFFORDERUNG);
        Scanner scannerEingabeChar = new Scanner(System.in);
        int zaehler = 0;
        
        while (!(eingabeString.equals("J") || eingabeString.equals("N")))
        {
            if(zaehler > 0)
            {
            Ausgabe.gebeStringAus(resource.Strings.HAT_NICHT_GEKLAPPT);
            }
            eingabeString = scannerEingabeChar.next();
            zaehler = zaehler + 1;
        }
        
        eingabeCharArray = eingabeString.toCharArray();
        eingabeChar = eingabeCharArray[0];
        return eingabeChar;
    }
}
