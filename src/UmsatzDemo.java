import java.util.Arrays;

public class UmsatzDemo
{
    public static void main(String[] args)
    {
        double[] umsaetzeJahr = new double[12];

        umsaetzeJahr[0] = 120.51;
        umsaetzeJahr[1] = 20.51;
        umsaetzeJahr[2] = 220.65;
        umsaetzeJahr[3] = 10.10;
        umsaetzeJahr[4] = 165.85;
        umsaetzeJahr[5] = 300.00;
        umsaetzeJahr[6] = 216.29;
        umsaetzeJahr[7] = 60.23;
        umsaetzeJahr[8] = 32.56;
        umsaetzeJahr[9] = 20.51;
        umsaetzeJahr[10] = 120.00;
        umsaetzeJahr[11] = 320.54;

        // oder
        // Achtung: . verwenden um Kommazahlen zu speichern
        double[] umsaetzeJahr1 = {120.51, 20.51, 220.65, 10.10, 165.85, 300.00, 216.29, 60.23, 32.56, 20.51, 120.00, 320.54};
        System.out.println(getUmsatzsteigerungGT10(umsaetzeJahr));

        double[][] umsaetzeWoche = {{12.2, 13.41, 14.68, 15.76, 16.23}, {5.43, 7.65, 9.32, 2.45, 3.42},
                {19.21, 21.45, 12.75, 22.88, 32.23}, {12.65, 4.76, 11.34, 21.89, 6.23}};

        double[] sumUmsaetzeWoche = calculateSumByWeek(umsaetzeWoche);

        for (int i = 0; i < sumUmsaetzeWoche.length; i++)
        {
            System.out.println("Umsatz der " + (i + 1) + ". Woche = " + sumUmsaetzeWoche[i]);
        }
    }

    public static int getUmsatzsteigerungGT10(double[] umsaetze)
    {
        int umsatzsteigerung = 0;
        for (int i = 0; i < umsaetze.length - 1; i++)
        {
            // Formel für die Berechnung: ((Zahl2-Zahl1)/Zahl1)*100
            if ((((umsaetze[i + 1] - umsaetze[i]) / umsaetze[i]) * 100) > 10)
            {
                umsatzsteigerung++;
            }
        }
        return umsatzsteigerung;
    }

    public static double[] calculateSumByWeek(double[][] umsaetze)
    {
        double[] sumUmsaetze = new double[umsaetze.length];

        // Schleife, welche die Wochen durch geht
        for (int i = 0; i < umsaetze.length; i++)
        {
            // Schleife für die Tagessätze innerhalb einer Woche
            for (int j = 0; j < umsaetze[i].length; j++)
            {
                sumUmsaetze[i] = sumUmsaetze[i] + umsaetze[i][j];
            }
        }

        return sumUmsaetze;
    }
}
