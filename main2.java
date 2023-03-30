import java.io.IOException;

public class main2 {
    public static void main(String[] args) {
        Flotte f = new Flotte();
        Voiture v1=new Voiture("A435336","EN PANNE","ISMAIL",5);
        Vehicule v2=new Vehicule("B324236","EN PANNE","HASSAN");
        Vehicule v3=new Vehicule("G299003","EN SERVICE","MOURAD");
        f.ajouter(v1);
        f.ajouter(v2);
        f.ajouter(v3);
        f.lister();
        //System.out.println(f.chercher("ISMAIL"));


    }
}
