public class Dico
{
    Noeud racine ;
    Dico ()
    {
        racine = null ;
    }
    public static void inserer (Dico d, String m)
    {
        d.racine = insererArbre (d.racine, m) ;
    }
    static Noeud insererArbre (Noeud n, String m)
    {
        if (n == null) return new Noeud (m, null, null) ;
        if (m.compareTo (n.str) == 0) return n ; // le mot est deja la
        if (m.compareTo (n.str) < 0)
            n.filsGauche = insererArbre (n.filsGauche, m) ;
        else n.filsDroit = insererArbre (n.filsDroit, m) ;
        return n ;
    }
    public static boolean existe(Dico d, String m) {
        return existeDansArbre(d.racine, m);
    }

    private static boolean existeDansArbre(Noeud n, String m) {
        if (n == null) {
            return false;
        } else if (m.compareTo(n.str) == 0) {
            return true;
        } else if (m.compareTo(n.str) < 0) {
            return existeDansArbre(n.filsGauche, m);
        } else {
            return existeDansArbre(n.filsDroit, m);
        }
    }

}
