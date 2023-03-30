import java.io.* ;
public class LitFichier
{
    public static void main (String args [])
    {
        try {
            InputStream s = new FileInputStream ("C:\\Users\\pc\\Desktop\\geeks talk logo\\test.txt") ;
            byte buffer [ ] = new byte [s.available()] ;
            s.read (buffer) ;
            for (int i = 0 ; i != buffer.length ; i++)
                System.out.print ( (char) buffer [i]) ;
        } catch (IOException e)
        {
            System.err.println ("Erreur lecture"+e) ;
        }
    }
}