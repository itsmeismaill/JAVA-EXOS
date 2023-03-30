import java.io.* ;
public class EcritFichier
{
    static public void main (String args [])
    {
        String chaine = "tester l'ecriture" ;
        try {
            OutputStream f = new FileOutputStream ("C:\\Users\\pc\\Desktop\\geeks talk logo\\test.txt") ;
            f.write (chaine.getBytes ()) ;
            f.close () ;
        } catch (IOException e)
        {
            System.err.println ("Erreur ecriture") ;
        }
    }
}