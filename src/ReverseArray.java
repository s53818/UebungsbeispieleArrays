import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args)
    {
        String[] array = {"Hallo", "Herr", "Max", "Mustermann"};

        // Arrays.toString() konvertiert ein array automatisch in einen String
        // damit man den Inhalt lesen kann.
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray(array)));
        System.out.println(Arrays.toString(reverseArray2(array)));
    }

    // Variante eins mit for()
    public static String[] reverseArray(String[] arrayToReverse)
    {
        String[] reversedArray = new String[arrayToReverse.length];
        int count = 0;

        // Beim letzten Feld im Array anfangen und bis zum ersten gehen
        for (int i = arrayToReverse.length - 1; i >= 0; i--)
        {
            // Counter, um ein neues Array von 0-n zu befuellen
            reversedArray[count] = arrayToReverse[i];
            count++;
        }

        return reversedArray;
    }

    // Variante zwei mit while()
    public static String[] reverseArray2(String[] arrayToReverse)
    {
        String[] reversedArray = new String[arrayToReverse.length];
        int count = 0;
        // arrayToReverse.length - 1 --> weil die laenge von 1 weg gezaehlt wird
        //                               die Felder im Array jedoch bei 0 beginnen
        //                               also ist die laenge immer um 1 groeßer
        int arrayLength = arrayToReverse.length - 1;

        while (arrayLength >= 0)
        {
            // Zusaetzliche Hilfsvariable, um von n-0 arrayLength gehen zu koennen
            reversedArray[count] = arrayToReverse[arrayLength];
            arrayLength--;
            count++;
        }

        return reversedArray;
    }
}
