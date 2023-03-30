public class Voiture extends Vehicule{

      int nbrplaces;
    public Voiture(String matricule,String etat , String employe,int nbrplaces) {
        super(matricule,etat,employe);
        this.nbrplaces=nbrplaces;
    }

    @Override
    public String toString() {
        return super.toString()+", nombre des places: "+ this.nbrplaces;
    }
}
