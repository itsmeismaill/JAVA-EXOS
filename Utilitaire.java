public class Utilitaire extends Vehicule
{
    double volume;
    public Utilitaire(String matricule,String etat , String employe,double volume){
        super(matricule,etat,employe);
        this.volume=volume;
    }

    @Override
    public String toString() {
        return super.toString()+"  Volume de charge en KG: "+this.volume;
    }
}
