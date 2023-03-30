import java.util.ArrayList;

public class Flotte {
    ArrayList<Vehicule> vehicules;
    public Flotte(){
        vehicules=new ArrayList<>();
    }
    public void ajouter( Vehicule vh){
        vehicules.add(vh);
        System.out.println("vehicule ajouter avec succes");
    }
    public String chercher(String cherche){
        for (Vehicule vehicule:vehicules) {
            if (vehicule.getMatricule().equals(cherche) || vehicule.getEmploye().equals(cherche)) {
                return vehicule.toString();
            }
        }
              return null ;
    }
    public void lister(){
        for (Vehicule vehicule:vehicules){
            System.out.println(vehicule.toString());
        }
    }
}
