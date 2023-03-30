import java.util.ArrayList;

public class Vehicule {
    private String matricule;
    private String employe;
    private String etat;
    public Vehicule(String matricule,String etat , String employe) {
        this.matricule = matricule;
        this.employe = employe;
        this.etat = etat;
    }
    public void affecter(String employe){
        this.employe=employe;
    }

    @Override
    public String toString() {
        return "Matricule : " + this.matricule + ", Etat : " + this.etat + ", Nom de l'employé : " + this.employe;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getEmploye() {
        return employe;
    }
}