import java.io.*;
public class Utile // fait la même chose que Scanner
{
    public static String lireChaine(String message) throws IOException {
        BufferedReader entree = new BufferedReader
                (new InputStreamReader(System.in));

        System.out.print(message);
        return entree.readLine();
    } //idem que nextLine() de Scanner
    public static int lireEntier(String message) throws IOException {
        return Integer.parseInt(lireChaine(message));
    } // idem que nextInt de Scanner
    public static char lireCaractere(String message) throws IOException

    {

        return lireChaine(message).charAt(0);

    }
    public static double lireDouble(String message) throws IOException

    {

        return  (double) Double.parseDouble(lireChaine(message));

    }
    }


