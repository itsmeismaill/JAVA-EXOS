import java.io.IOException;

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
    public static void main(Dico d ,String[] args) {

        //ajouter les elements sans l element d indice 0
        for (int i = 1; i < args.length; i++) {
            Dico.inserer(d, args[i]);
        }
        // verifier l existance de l elmt a l indice 0
        if (Dico.existe(d, args[0])==true) {
            System.out.println("Le mot '" + args[0] + "' existe dans le dictionnaire.");
        } else {
            System.out.println("Le mot '" + args[0] + "' n'existe pas dans le dictionnaire.");
        }
    }


}
